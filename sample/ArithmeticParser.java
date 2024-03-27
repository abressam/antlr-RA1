// Generated from Arithmetic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmeticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INT=10, NEGATIVE_INT=11, ZERO=12, FLOAT=13, NEGATIVE_FLOAT=14, MEM=15, 
		RES=16, NEWLINE=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_operation = 2, RULE_operator = 3, RULE_number = 4, 
		RULE_rational = 5, RULE_nonZeroFloat = 6, RULE_integer = 7, RULE_nonZeroInt = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "operation", "operator", "number", "rational", "nonZeroFloat", 
			"integer", "nonZeroInt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'|'", "'/'", "'%'", "'^'", 
			null, null, "'0'", null, null, "'MEM'", "'RES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "INT", "NEGATIVE_INT", 
			"ZERO", "FLOAT", "NEGATIVE_FLOAT", "MEM", "RES", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Arithmetic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ArithmeticParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArithmeticParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(18);
				expr();
				setState(19);
				match(NEWLINE);
				}
				}
				setState(25);
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

	public static class ExprContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<NonZeroIntContext> nonZeroInt() {
			return getRuleContexts(NonZeroIntContext.class);
		}
		public NonZeroIntContext nonZeroInt(int i) {
			return getRuleContext(NonZeroIntContext.class,i);
		}
		public RationalContext rational() {
			return getRuleContext(RationalContext.class,0);
		}
		public NonZeroFloatContext nonZeroFloat() {
			return getRuleContext(NonZeroFloatContext.class,0);
		}
		public TerminalNode MEM() { return getToken(ArithmeticParser.MEM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RES() { return getToken(ArithmeticParser.RES, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__0);
				setState(27);
				operation();
				setState(28);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__0);
				setState(31);
				number();
				setState(32);
				number();
				setState(33);
				match(T__2);
				setState(34);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(T__0);
				setState(37);
				number();
				setState(38);
				number();
				setState(39);
				match(T__3);
				setState(40);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(T__0);
				setState(43);
				number();
				setState(44);
				number();
				setState(45);
				match(T__4);
				setState(46);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(T__0);
				setState(49);
				integer();
				setState(50);
				nonZeroInt();
				setState(51);
				match(T__5);
				setState(52);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				match(T__0);
				setState(55);
				rational();
				setState(56);
				nonZeroFloat();
				setState(57);
				match(T__5);
				setState(58);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				match(T__0);
				setState(61);
				rational();
				setState(62);
				nonZeroInt();
				setState(63);
				match(T__5);
				setState(64);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				match(T__0);
				setState(67);
				integer();
				setState(68);
				nonZeroFloat();
				setState(69);
				match(T__5);
				setState(70);
				match(T__1);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				match(T__0);
				setState(73);
				integer();
				setState(74);
				nonZeroInt();
				setState(75);
				match(T__6);
				setState(76);
				match(T__1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(78);
				match(T__0);
				setState(79);
				nonZeroInt();
				setState(80);
				nonZeroInt();
				setState(81);
				match(T__6);
				setState(82);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
				match(T__0);
				setState(85);
				integer();
				setState(86);
				integer();
				setState(87);
				match(T__7);
				setState(88);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(90);
				match(T__0);
				setState(91);
				nonZeroInt();
				setState(92);
				nonZeroInt();
				setState(93);
				match(T__7);
				setState(94);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(96);
				match(T__0);
				setState(97);
				number();
				setState(98);
				integer();
				setState(99);
				match(T__8);
				setState(100);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(102);
				match(T__0);
				setState(103);
				number();
				setState(104);
				match(MEM);
				setState(105);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(107);
				match(T__0);
				setState(108);
				number();
				setState(109);
				match(MEM);
				setState(110);
				expr();
				setState(111);
				operator();
				setState(112);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(114);
				match(T__0);
				setState(115);
				match(MEM);
				setState(116);
				match(T__1);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(117);
				match(T__0);
				setState(118);
				expr();
				setState(119);
				match(MEM);
				setState(120);
				match(T__1);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(122);
				match(T__0);
				setState(123);
				match(MEM);
				setState(124);
				expr();
				setState(125);
				match(T__1);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(127);
				match(T__0);
				setState(128);
				match(MEM);
				setState(129);
				expr();
				setState(130);
				operator();
				setState(131);
				match(T__1);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(133);
				match(T__0);
				setState(134);
				integer();
				setState(135);
				match(RES);
				setState(136);
				match(T__1);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(138);
				match(T__0);
				setState(139);
				integer();
				setState(140);
				match(RES);
				setState(141);
				expr();
				setState(142);
				match(T__1);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(144);
				match(T__0);
				setState(145);
				expr();
				setState(146);
				match(RES);
				setState(147);
				match(T__1);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(149);
				match(T__0);
				setState(150);
				expr();
				setState(151);
				match(RES);
				setState(152);
				expr();
				setState(153);
				match(T__1);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(155);
				match(T__0);
				setState(156);
				number();
				setState(157);
				expr();
				setState(158);
				operator();
				setState(159);
				match(T__1);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(161);
				match(T__0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(162);
					expr();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(T__1);
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

	public static class OperationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			expr();
			setState(172);
			expr();
			setState(173);
			operator();
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ArithmeticParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode NEGATIVE_INT() { return getToken(ArithmeticParser.NEGATIVE_INT, 0); }
		public TerminalNode NEGATIVE_FLOAT() { return getToken(ArithmeticParser.NEGATIVE_FLOAT, 0); }
		public TerminalNode ZERO() { return getToken(ArithmeticParser.ZERO, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NEGATIVE_INT) | (1L << ZERO) | (1L << FLOAT) | (1L << NEGATIVE_FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RationalContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ArithmeticParser.FLOAT, 0); }
		public TerminalNode ZERO() { return getToken(ArithmeticParser.ZERO, 0); }
		public RationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterRational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitRational(this);
		}
	}

	public final RationalContext rational() throws RecognitionException {
		RationalContext _localctx = new RationalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==ZERO || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NonZeroFloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ArithmeticParser.FLOAT, 0); }
		public TerminalNode NEGATIVE_FLOAT() { return getToken(ArithmeticParser.NEGATIVE_FLOAT, 0); }
		public NonZeroFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonZeroFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterNonZeroFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitNonZeroFloat(this);
		}
	}

	public final NonZeroFloatContext nonZeroFloat() throws RecognitionException {
		NonZeroFloatContext _localctx = new NonZeroFloatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonZeroFloat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==NEGATIVE_FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode ZERO() { return getToken(ArithmeticParser.ZERO, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NonZeroIntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArithmeticParser.INT, 0); }
		public TerminalNode NEGATIVE_INT() { return getToken(ArithmeticParser.NEGATIVE_INT, 0); }
		public NonZeroIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonZeroInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterNonZeroInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitNonZeroInt(this);
		}
	}

	public final NonZeroIntContext nonZeroInt() throws RecognitionException {
		NonZeroIntContext _localctx = new NonZeroIntContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonZeroInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==NEGATIVE_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3\u00a6\n\3\f\3\16\3\u00a9\13\3\3\3\5\3\u00ac"+
		"\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\2\2\13\2\4\6\b\n\f\16\20\22\2\b\3\2\5\13\3\2\f\20\3\2\16\17\3\2\17"+
		"\20\4\2\f\f\16\16\3\2\f\r\2\u00ce\2\31\3\2\2\2\4\u00ab\3\2\2\2\6\u00ad"+
		"\3\2\2\2\b\u00b1\3\2\2\2\n\u00b3\3\2\2\2\f\u00b5\3\2\2\2\16\u00b7\3\2"+
		"\2\2\20\u00b9\3\2\2\2\22\u00bb\3\2\2\2\24\25\5\4\3\2\25\26\7\23\2\2\26"+
		"\30\3\2\2\2\27\24\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\3\3\2\2\2\33\31\3\2\2\2\34\35\7\3\2\2\35\36\5\6\4\2\36\37\7\4\2\2\37"+
		"\u00ac\3\2\2\2 !\7\3\2\2!\"\5\n\6\2\"#\5\n\6\2#$\7\5\2\2$%\7\4\2\2%\u00ac"+
		"\3\2\2\2&\'\7\3\2\2\'(\5\n\6\2()\5\n\6\2)*\7\6\2\2*+\7\4\2\2+\u00ac\3"+
		"\2\2\2,-\7\3\2\2-.\5\n\6\2./\5\n\6\2/\60\7\7\2\2\60\61\7\4\2\2\61\u00ac"+
		"\3\2\2\2\62\63\7\3\2\2\63\64\5\20\t\2\64\65\5\22\n\2\65\66\7\b\2\2\66"+
		"\67\7\4\2\2\67\u00ac\3\2\2\289\7\3\2\29:\5\f\7\2:;\5\16\b\2;<\7\b\2\2"+
		"<=\7\4\2\2=\u00ac\3\2\2\2>?\7\3\2\2?@\5\f\7\2@A\5\22\n\2AB\7\b\2\2BC\7"+
		"\4\2\2C\u00ac\3\2\2\2DE\7\3\2\2EF\5\20\t\2FG\5\16\b\2GH\7\b\2\2HI\7\4"+
		"\2\2I\u00ac\3\2\2\2JK\7\3\2\2KL\5\20\t\2LM\5\22\n\2MN\7\t\2\2NO\7\4\2"+
		"\2O\u00ac\3\2\2\2PQ\7\3\2\2QR\5\22\n\2RS\5\22\n\2ST\7\t\2\2TU\7\4\2\2"+
		"U\u00ac\3\2\2\2VW\7\3\2\2WX\5\20\t\2XY\5\20\t\2YZ\7\n\2\2Z[\7\4\2\2[\u00ac"+
		"\3\2\2\2\\]\7\3\2\2]^\5\22\n\2^_\5\22\n\2_`\7\n\2\2`a\7\4\2\2a\u00ac\3"+
		"\2\2\2bc\7\3\2\2cd\5\n\6\2de\5\20\t\2ef\7\13\2\2fg\7\4\2\2g\u00ac\3\2"+
		"\2\2hi\7\3\2\2ij\5\n\6\2jk\7\21\2\2kl\7\4\2\2l\u00ac\3\2\2\2mn\7\3\2\2"+
		"no\5\n\6\2op\7\21\2\2pq\5\4\3\2qr\5\b\5\2rs\7\4\2\2s\u00ac\3\2\2\2tu\7"+
		"\3\2\2uv\7\21\2\2v\u00ac\7\4\2\2wx\7\3\2\2xy\5\4\3\2yz\7\21\2\2z{\7\4"+
		"\2\2{\u00ac\3\2\2\2|}\7\3\2\2}~\7\21\2\2~\177\5\4\3\2\177\u0080\7\4\2"+
		"\2\u0080\u00ac\3\2\2\2\u0081\u0082\7\3\2\2\u0082\u0083\7\21\2\2\u0083"+
		"\u0084\5\4\3\2\u0084\u0085\5\b\5\2\u0085\u0086\7\4\2\2\u0086\u00ac\3\2"+
		"\2\2\u0087\u0088\7\3\2\2\u0088\u0089\5\20\t\2\u0089\u008a\7\22\2\2\u008a"+
		"\u008b\7\4\2\2\u008b\u00ac\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008e\5\20"+
		"\t\2\u008e\u008f\7\22\2\2\u008f\u0090\5\4\3\2\u0090\u0091\7\4\2\2\u0091"+
		"\u00ac\3\2\2\2\u0092\u0093\7\3\2\2\u0093\u0094\5\4\3\2\u0094\u0095\7\22"+
		"\2\2\u0095\u0096\7\4\2\2\u0096\u00ac\3\2\2\2\u0097\u0098\7\3\2\2\u0098"+
		"\u0099\5\4\3\2\u0099\u009a\7\22\2\2\u009a\u009b\5\4\3\2\u009b\u009c\7"+
		"\4\2\2\u009c\u00ac\3\2\2\2\u009d\u009e\7\3\2\2\u009e\u009f\5\n\6\2\u009f"+
		"\u00a0\5\4\3\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2\7\4\2\2\u00a2\u00ac\3\2"+
		"\2\2\u00a3\u00a7\7\3\2\2\u00a4\u00a6\5\4\3\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\7\4\2\2\u00ab\34\3\2\2\2\u00ab \3"+
		"\2\2\2\u00ab&\3\2\2\2\u00ab,\3\2\2\2\u00ab\62\3\2\2\2\u00ab8\3\2\2\2\u00ab"+
		">\3\2\2\2\u00abD\3\2\2\2\u00abJ\3\2\2\2\u00abP\3\2\2\2\u00abV\3\2\2\2"+
		"\u00ab\\\3\2\2\2\u00abb\3\2\2\2\u00abh\3\2\2\2\u00abm\3\2\2\2\u00abt\3"+
		"\2\2\2\u00abw\3\2\2\2\u00ab|\3\2\2\2\u00ab\u0081\3\2\2\2\u00ab\u0087\3"+
		"\2\2\2\u00ab\u008c\3\2\2\2\u00ab\u0092\3\2\2\2\u00ab\u0097\3\2\2\2\u00ab"+
		"\u009d\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ac\5\3\2\2\2\u00ad\u00ae\5\4\3\2"+
		"\u00ae\u00af\5\4\3\2\u00af\u00b0\5\b\5\2\u00b0\7\3\2\2\2\u00b1\u00b2\t"+
		"\2\2\2\u00b2\t\3\2\2\2\u00b3\u00b4\t\3\2\2\u00b4\13\3\2\2\2\u00b5\u00b6"+
		"\t\4\2\2\u00b6\r\3\2\2\2\u00b7\u00b8\t\5\2\2\u00b8\17\3\2\2\2\u00b9\u00ba"+
		"\t\6\2\2\u00ba\21\3\2\2\2\u00bb\u00bc\t\7\2\2\u00bc\23\3\2\2\2\5\31\u00a7"+
		"\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}