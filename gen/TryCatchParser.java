// Generated from C:/Users/pilip/Desktop/trycatch\TryCatchParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TryCatchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, WS=2, TRY=3, CATCH=4, FINALLY=5, LEFT_OVAL_BRACKET=6, RIGHT_OVAL_BRACKET=7, 
		LEFT_CURLY_BRACKET=8, RIGHT_CURLY_BRACKET=9, DOT=10, BIT_OR=11, SEMICOLON=12, 
		ASSIGN=13, VAR=14, NEW=15;
	public static final int
		RULE_block = 0, RULE_identifier = 1, RULE_tryStatement = 2, RULE_catchBlock = 3, 
		RULE_catchClassTypes = 4, RULE_finallyBlock = 5, RULE_resourceSpecification = 6, 
		RULE_resource = 7, RULE_className = 8, RULE_dummyClassInitialization = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"block", "identifier", "tryStatement", "catchBlock", "catchClassTypes", 
			"finallyBlock", "resourceSpecification", "resource", "className", "dummyClassInitialization"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'try'", "'catch'", "'finally'", "'('", "')'", "'{'", 
			"'}'", "'.'", "'|'", "';'", "'='", "'var'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "WS", "TRY", "CATCH", "FINALLY", "LEFT_OVAL_BRACKET", 
			"RIGHT_OVAL_BRACKET", "LEFT_CURLY_BRACKET", "RIGHT_CURLY_BRACKET", "DOT", 
			"BIT_OR", "SEMICOLON", "ASSIGN", "VAR", "NEW"
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
	public String getGrammarFileName() { return "TryCatchParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TryCatchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY_BRACKET() { return getToken(TryCatchParser.LEFT_CURLY_BRACKET, 0); }
		public TerminalNode RIGHT_CURLY_BRACKET() { return getToken(TryCatchParser.RIGHT_CURLY_BRACKET, 0); }
		public List<TryStatementContext> tryStatement() {
			return getRuleContexts(TryStatementContext.class);
		}
		public TryStatementContext tryStatement(int i) {
			return getRuleContext(TryStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(LEFT_CURLY_BRACKET);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRY) {
				{
				{
				setState(21);
				tryStatement();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(RIGHT_CURLY_BRACKET);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TryCatchParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(IDENTIFIER);
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

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(TryCatchParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tryStatement);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(TRY);
				setState(32);
				block();
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(33);
					catchBlock();
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CATCH );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(TRY);
				setState(39);
				block();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(40);
					catchBlock();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				finallyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(TRY);
				setState(49);
				resourceSpecification();
				setState(50);
				block();
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					catchBlock();
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CATCH );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(TRY);
				setState(57);
				resourceSpecification();
				setState(58);
				block();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(59);
					catchBlock();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				finallyBlock();
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

	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(TryCatchParser.CATCH, 0); }
		public TerminalNode LEFT_OVAL_BRACKET() { return getToken(TryCatchParser.LEFT_OVAL_BRACKET, 0); }
		public CatchClassTypesContext catchClassTypes() {
			return getRuleContext(CatchClassTypesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RIGHT_OVAL_BRACKET() { return getToken(TryCatchParser.RIGHT_OVAL_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitCatchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitCatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_catchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CATCH);
			setState(70);
			match(LEFT_OVAL_BRACKET);
			setState(71);
			catchClassTypes();
			setState(72);
			identifier();
			setState(73);
			match(RIGHT_OVAL_BRACKET);
			setState(74);
			block();
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

	public static class CatchClassTypesContext extends ParserRuleContext {
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<TerminalNode> BIT_OR() { return getTokens(TryCatchParser.BIT_OR); }
		public TerminalNode BIT_OR(int i) {
			return getToken(TryCatchParser.BIT_OR, i);
		}
		public CatchClassTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClassTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterCatchClassTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitCatchClassTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitCatchClassTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClassTypesContext catchClassTypes() throws RecognitionException {
		CatchClassTypesContext _localctx = new CatchClassTypesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_catchClassTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			className();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIT_OR) {
				{
				{
				setState(77);
				match(BIT_OR);
				setState(78);
				className();
				}
				}
				setState(83);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(TryCatchParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(FINALLY);
			setState(85);
			block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LEFT_OVAL_BRACKET() { return getToken(TryCatchParser.LEFT_OVAL_BRACKET, 0); }
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public TerminalNode RIGHT_OVAL_BRACKET() { return getToken(TryCatchParser.RIGHT_OVAL_BRACKET, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_resourceSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LEFT_OVAL_BRACKET);
			setState(88);
			resource();
			setState(89);
			match(RIGHT_OVAL_BRACKET);
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

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(TryCatchParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TryCatchParser.ASSIGN, 0); }
		public DummyClassInitializationContext dummyClassInitialization() {
			return getRuleContext(DummyClassInitializationContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_resource);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(VAR);
				setState(92);
				identifier();
				setState(93);
				match(ASSIGN);
				setState(94);
				dummyClassInitialization();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			identifier();
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

	public static class DummyClassInitializationContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(TryCatchParser.NEW, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode LEFT_OVAL_BRACKET() { return getToken(TryCatchParser.LEFT_OVAL_BRACKET, 0); }
		public TerminalNode RIGHT_OVAL_BRACKET() { return getToken(TryCatchParser.RIGHT_OVAL_BRACKET, 0); }
		public DummyClassInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dummyClassInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).enterDummyClassInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TryCatchParserListener ) ((TryCatchParserListener)listener).exitDummyClassInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TryCatchParserVisitor ) return ((TryCatchParserVisitor<? extends T>)visitor).visitDummyClassInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DummyClassInitializationContext dummyClassInitialization() throws RecognitionException {
		DummyClassInitializationContext _localctx = new DummyClassInitializationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dummyClassInitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(NEW);
			setState(102);
			className();
			setState(103);
			match(LEFT_OVAL_BRACKET);
			setState(104);
			match(RIGHT_OVAL_BRACKET);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\6\4%\n"+
		"\4\r\4\16\4&\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\6\4\67\n\4\r\4\16\48\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4\3"+
		"\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6R\n\6\f\6\16\6"+
		"U\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\td\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2"+
		"\2l\2\26\3\2\2\2\4\37\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nN\3\2\2\2\fV\3\2"+
		"\2\2\16Y\3\2\2\2\20c\3\2\2\2\22e\3\2\2\2\24g\3\2\2\2\26\32\7\n\2\2\27"+
		"\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33"+
		"\35\3\2\2\2\34\32\3\2\2\2\35\36\7\13\2\2\36\3\3\2\2\2\37 \7\3\2\2 \5\3"+
		"\2\2\2!\"\7\5\2\2\"$\5\2\2\2#%\5\b\5\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&"+
		"\'\3\2\2\2\'F\3\2\2\2()\7\5\2\2)-\5\2\2\2*,\5\b\5\2+*\3\2\2\2,/\3\2\2"+
		"\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\5\f\7\2\61F\3\2\2\2"+
		"\62\63\7\5\2\2\63\64\5\16\b\2\64\66\5\2\2\2\65\67\5\b\5\2\66\65\3\2\2"+
		"\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29F\3\2\2\2:;\7\5\2\2;<\5\16\b\2<@"+
		"\5\2\2\2=?\5\b\5\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B"+
		"@\3\2\2\2CD\5\f\7\2DF\3\2\2\2E!\3\2\2\2E(\3\2\2\2E\62\3\2\2\2E:\3\2\2"+
		"\2F\7\3\2\2\2GH\7\6\2\2HI\7\b\2\2IJ\5\n\6\2JK\5\4\3\2KL\7\t\2\2LM\5\2"+
		"\2\2M\t\3\2\2\2NS\5\22\n\2OP\7\r\2\2PR\5\22\n\2QO\3\2\2\2RU\3\2\2\2SQ"+
		"\3\2\2\2ST\3\2\2\2T\13\3\2\2\2US\3\2\2\2VW\7\7\2\2WX\5\2\2\2X\r\3\2\2"+
		"\2YZ\7\b\2\2Z[\5\20\t\2[\\\7\t\2\2\\\17\3\2\2\2]^\7\20\2\2^_\5\4\3\2_"+
		"`\7\17\2\2`a\5\24\13\2ad\3\2\2\2bd\5\4\3\2c]\3\2\2\2cb\3\2\2\2d\21\3\2"+
		"\2\2ef\5\4\3\2f\23\3\2\2\2gh\7\21\2\2hi\5\22\n\2ij\7\b\2\2jk\7\t\2\2k"+
		"\25\3\2\2\2\n\32&-8@ESc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}