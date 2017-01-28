// Generated from CSS.g4 by ANTLR 4.6

package org.antlr.isep.langAndCompil.project.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLETTERS=1, ULETTERS=2, NUMBERS=3, HASH=4, COMMA=5, SPACE=6, ACCOLADE1=7, 
		ACCOLADE2=8, POINTS=9, POINT=10, SEMICOLON=11, DASH=12;
	public static final int
		RULE_propertyName = 0, RULE_property = 1, RULE_value = 2, RULE_selector = 3, 
		RULE_selectors = 4, RULE_regle = 5, RULE_regles = 6;
	public static final String[] ruleNames = {
		"propertyName", "property", "value", "selector", "selectors", "regle", 
		"regles"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'#'", "','", null, "'{'", "'}'", "':'", "'.'", 
		"';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LLETTERS", "ULETTERS", "NUMBERS", "HASH", "COMMA", "SPACE", "ACCOLADE1", 
		"ACCOLADE2", "POINTS", "POINT", "SEMICOLON", "DASH"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PropertyNameContext extends ParserRuleContext {
		public List<TerminalNode> ULETTERS() { return getTokens(CSSParser.ULETTERS); }
		public TerminalNode ULETTERS(int i) {
			return getToken(CSSParser.ULETTERS, i);
		}
		public List<TerminalNode> LLETTERS() { return getTokens(CSSParser.LLETTERS); }
		public TerminalNode LLETTERS(int i) {
			return getToken(CSSParser.LLETTERS, i);
		}
		public List<TerminalNode> DASH() { return getTokens(CSSParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(CSSParser.DASH, i);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitPropertyName(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_propertyName);
		int _la;
		try {
			int _alt;
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(14);
					_la = _input.LA(1);
					if ( !(_la==LLETTERS || _la==ULETTERS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(17); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LLETTERS || _la==ULETTERS );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(19);
						_la = _input.LA(1);
						if ( !(_la==LLETTERS || _la==ULETTERS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(22); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(24);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << DASH))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << DASH))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode POINTS() { return getToken(CSSParser.POINTS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSSParser.SEMICOLON, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			propertyName();
			setState(32);
			match(POINTS);
			setState(33);
			value();
			setState(34);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public List<TerminalNode> ULETTERS() { return getTokens(CSSParser.ULETTERS); }
		public TerminalNode ULETTERS(int i) {
			return getToken(CSSParser.ULETTERS, i);
		}
		public List<TerminalNode> LLETTERS() { return getTokens(CSSParser.LLETTERS); }
		public TerminalNode LLETTERS(int i) {
			return getToken(CSSParser.LLETTERS, i);
		}
		public List<TerminalNode> NUMBERS() { return getTokens(CSSParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(CSSParser.NUMBERS, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(CSSParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CSSParser.SPACE, i);
		}
		public List<TerminalNode> DASH() { return getTokens(CSSParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(CSSParser.DASH, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		int _la;
		try {
			int _alt;
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HASH:
					{
					setState(36);
					match(HASH);
					}
					break;
				case LLETTERS:
				case ULETTERS:
				case NUMBERS:
				case SPACE:
					{
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(37);
						match(SPACE);
						}
						}
						setState(42);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << NUMBERS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << NUMBERS))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(50);
						_la = _input.LA(1);
						if ( !(_la==LLETTERS || _la==ULETTERS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(53); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(55);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << DASH))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << DASH))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public TerminalNode POINT() { return getToken(CSSParser.POINT, 0); }
		public List<TerminalNode> ULETTERS() { return getTokens(CSSParser.ULETTERS); }
		public TerminalNode ULETTERS(int i) {
			return getToken(CSSParser.ULETTERS, i);
		}
		public List<TerminalNode> LLETTERS() { return getTokens(CSSParser.LLETTERS); }
		public TerminalNode LLETTERS(int i) {
			return getToken(CSSParser.LLETTERS, i);
		}
		public List<TerminalNode> NUMBERS() { return getTokens(CSSParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(CSSParser.NUMBERS, i);
		}
		public TerminalNode POINTS() { return getToken(CSSParser.POINTS, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selector);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==HASH || _la==POINT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(63);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << NUMBERS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(66); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << NUMBERS))) != 0) );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << NUMBERS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << NUMBERS))) != 0) );
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(73);
				_la = _input.LA(1);
				if ( !(_la==LLETTERS || _la==ULETTERS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(74);
				match(POINTS);
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					_la = _input.LA(1);
					if ( !(_la==LLETTERS || _la==ULETTERS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LLETTERS || _la==ULETTERS );
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorsContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public SelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitSelectors(this);
		}
	}

	public final SelectorsContext selectors() throws RecognitionException {
		SelectorsContext _localctx = new SelectorsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			selector();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83);
				match(COMMA);
				setState(84);
				selector();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegleContext extends ParserRuleContext {
		public SelectorsContext selectors() {
			return getRuleContext(SelectorsContext.class,0);
		}
		public TerminalNode ACCOLADE1() { return getToken(CSSParser.ACCOLADE1, 0); }
		public TerminalNode ACCOLADE2() { return getToken(CSSParser.ACCOLADE2, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public RegleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterRegle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitRegle(this);
		}
	}

	public final RegleContext regle() throws RecognitionException {
		RegleContext _localctx = new RegleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_regle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			selectors();
			setState(91);
			match(ACCOLADE1);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LLETTERS || _la==ULETTERS) {
				{
				{
				setState(92);
				property();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(ACCOLADE2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReglesContext extends ParserRuleContext {
		public List<RegleContext> regle() {
			return getRuleContexts(RegleContext.class);
		}
		public RegleContext regle(int i) {
			return getRuleContext(RegleContext.class,i);
		}
		public ReglesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterRegles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitRegles(this);
		}
	}

	public final ReglesContext regles() throws RecognitionException {
		ReglesContext _localctx = new ReglesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_regles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				regle();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLETTERS) | (1L << ULETTERS) | (1L << NUMBERS) | (1L << HASH) | (1L << POINT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\2\6\2\27\n\2\r\2\16\2\30\3\2\6\2\34\n\2\r\2\16\2\35\5\2 \n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\5\4.\n\4\3\4\6\4\61\n\4"+
		"\r\4\16\4\62\3\4\6\4\66\n\4\r\4\16\4\67\3\4\6\4;\n\4\r\4\16\4<\5\4?\n"+
		"\4\3\5\3\5\6\5C\n\5\r\5\16\5D\3\5\6\5H\n\5\r\5\16\5I\3\5\3\5\3\5\6\5O"+
		"\n\5\r\5\16\5P\5\5S\n\5\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\3\7\3"+
		"\7\7\7`\n\7\f\7\16\7c\13\7\3\7\3\7\3\b\6\bh\n\b\r\b\16\bi\3\b\2\2\t\2"+
		"\4\6\b\n\f\16\2\6\3\2\3\4\4\2\3\4\16\16\3\2\3\5\4\2\6\6\f\fv\2\37\3\2"+
		"\2\2\4!\3\2\2\2\6>\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f\\\3\2\2\2\16g\3\2\2"+
		"\2\20\22\t\2\2\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2"+
		"\2\24 \3\2\2\2\25\27\t\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2"+
		"\30\31\3\2\2\2\31\33\3\2\2\2\32\34\t\3\2\2\33\32\3\2\2\2\34\35\3\2\2\2"+
		"\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\21\3\2\2\2\37\26\3\2\2\2 "+
		"\3\3\2\2\2!\"\5\2\2\2\"#\7\13\2\2#$\5\6\4\2$%\7\r\2\2%\5\3\2\2\2&.\7\6"+
		"\2\2\')\7\b\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*\3"+
		"\2\2\2-&\3\2\2\2-*\3\2\2\2.\60\3\2\2\2/\61\t\4\2\2\60/\3\2\2\2\61\62\3"+
		"\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63?\3\2\2\2\64\66\t\2\2\2\65\64\3\2"+
		"\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29;\t\3\2\2:9\3\2"+
		"\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2>-\3\2\2\2>\65\3\2\2\2?\7"+
		"\3\2\2\2@B\t\5\2\2AC\t\4\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E"+
		"S\3\2\2\2FH\t\4\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JS\3\2\2\2"+
		"KL\t\2\2\2LN\7\13\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2"+
		"\2QS\3\2\2\2R@\3\2\2\2RG\3\2\2\2RK\3\2\2\2S\t\3\2\2\2TY\5\b\5\2UV\7\7"+
		"\2\2VX\5\b\5\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\13\3\2\2\2[Y\3"+
		"\2\2\2\\]\5\n\6\2]a\7\t\2\2^`\5\4\3\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab"+
		"\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\n\2\2e\r\3\2\2\2fh\5\f\7\2gf\3\2\2\2"+
		"hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3\2\2\2\23\23\30\35\37*-\62\67<>DI"+
		"PRYai";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}