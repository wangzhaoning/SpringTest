package com.spoint;

import org.springframework.beans.factory.annotation.Autowired;

public class EitorText {
	private Spell spell;
	//private String name;
	@Autowired
	public EitorText(Spell spell) {
		System.out.println("editor constructor!");
		this.spell=spell;
	}
	void spellCheck() {
		spell.checkSpelling();
	}
}
