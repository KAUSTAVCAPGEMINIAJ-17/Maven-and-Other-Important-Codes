package com.capgemini.author.personalDetails.services;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.author.personalDetails.models.AuthorModel;


public class AuthorManager {
		Map<String, AuthorModel> authorList = new ConcurrentHashMap<String, AuthorModel>();

		public AuthorManager() {

		}

		

		public void addAuthor(String name, String email, char gender) {
			AuthorModel author = new AuthorModel(name, email, gender);

			validateAuthor(author);
			checkAuthorExists(author);
			authorList.put(generateKey(author),author);
		}

		private String generateKey(AuthorModel author) {
			return String.format("%s-%s", author.getName(), author.getEmail());
		}

		private void checkAuthorExists(AuthorModel author) {
			if(authorList.containsKey(generateKey(author)))
				throw new RuntimeException("Author already exists");
			
		}

		private void validateAuthor(AuthorModel author) {
			author.validateName();
			author.validateEmail();
			author.validateGender();
		}
		
		public Collection<AuthorModel> getAllAuthors() {
			return authorList.values();
		}
}