// Generated from CSS.g4 by ANTLR 4.6

package org.antlr.isep.langAndCompil.project.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSSParser}.
 */
public interface CSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(CSSParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(CSSParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CSSParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CSSParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CSSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CSSParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CSSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CSSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selectors}.
	 * @param ctx the parse tree
	 */
	void enterSelectors(CSSParser.SelectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selectors}.
	 * @param ctx the parse tree
	 */
	void exitSelectors(CSSParser.SelectorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#regle}.
	 * @param ctx the parse tree
	 */
	void enterRegle(CSSParser.RegleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#regle}.
	 * @param ctx the parse tree
	 */
	void exitRegle(CSSParser.RegleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#regles}.
	 * @param ctx the parse tree
	 */
	void enterRegles(CSSParser.ReglesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#regles}.
	 * @param ctx the parse tree
	 */
	void exitRegles(CSSParser.ReglesContext ctx);
}