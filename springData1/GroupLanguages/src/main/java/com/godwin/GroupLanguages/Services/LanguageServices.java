//package com.godwin.GroupLanguages.Services;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.assertj.core.util.Arrays;
//import org.springframework.stereotype.Service;
//
//import com.godwin.GroupLanguages.Controller.Languages;
//import com.godwin.GroupLanguages.models.Language;
//
//@Service
//public class LanguageServices {
//
//    // initialize the languages variable with values
//    private List<Language> languages = new ArrayList<Language>(Arrays.asList(
//    		
//    		new Language("java", "godwinyeboah", "1"),
//    		new Language("java", "godwinyeboah", "1"),
//    		new Language("java", "godwinyeboah", "1"),
//    		new Language("java", "godwinyeboah", "1")
//    		));
//    
//    // returns all the languages
//    public List<Language> allLanguages() {
//        return languages;
//    }
//    
//    public Language findLangByIndex(int index) {
//	    	if (index < languages.size()) {
//	    		return languages.get(index);
//	    	} else {
//	    		return null;
//	    	}
//    }
//    
//    public void addLang(Language language) {
//    		languages.add(language);
//    }
//    
//    public void updateLang(int id, Language language) {
//    		if (id < languages.size()) {
//    			languages.set(id, language);
//    			
//    		}
//    }
//    
//    public void deleteLang(int id) {
//    		if (id < languages.size()) {
//    			languages.remove(id);
//    		}
//    }
//	
//	
//	
//	
//}
