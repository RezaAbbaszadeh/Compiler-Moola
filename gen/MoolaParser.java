// Generated from E:/uni/7/projects/Moola/grammar\Moola.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoolaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, CONST_NUM=50, CONST_STR=51, NL=52, 
		ID=53, COMMENT=54, MULTILINE_COMMENT=55, WS=56;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_entryClassDeclaration = 2, 
		RULE_fieldDeclaration = 3, RULE_access_modifier = 4, RULE_methodDeclaration = 5, 
		RULE_closedStatement = 6, RULE_closedConditional = 7, RULE_openConditional = 8, 
		RULE_openStatement = 9, RULE_statement = 10, RULE_statementVarDef = 11, 
		RULE_statementBlock = 12, RULE_statementContinue = 13, RULE_statementBreak = 14, 
		RULE_statementReturn = 15, RULE_statementClosedLoop = 16, RULE_statementOpenLoop = 17, 
		RULE_statementWrite = 18, RULE_statementAssignment = 19, RULE_statementInc = 20, 
		RULE_statementDec = 21, RULE_expression = 22, RULE_expressionOr = 23, 
		RULE_expressionOrTemp = 24, RULE_expressionAnd = 25, RULE_expressionAndTemp = 26, 
		RULE_expressionEq = 27, RULE_expressionEqTemp = 28, RULE_expressionCmp = 29, 
		RULE_expressionCmpTemp = 30, RULE_expressionAdd = 31, RULE_expressionAddTemp = 32, 
		RULE_expressionMultMod = 33, RULE_expressionMultModTemp = 34, RULE_expressionUnary = 35, 
		RULE_expressionMethods = 36, RULE_expressionMethodsTemp = 37, RULE_expressionOther = 38, 
		RULE_moolaType = 39, RULE_singleType = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "entryClassDeclaration", "fieldDeclaration", 
			"access_modifier", "methodDeclaration", "closedStatement", "closedConditional", 
			"openConditional", "openStatement", "statement", "statementVarDef", "statementBlock", 
			"statementContinue", "statementBreak", "statementReturn", "statementClosedLoop", 
			"statementOpenLoop", "statementWrite", "statementAssignment", "statementInc", 
			"statementDec", "expression", "expressionOr", "expressionOrTemp", "expressionAnd", 
			"expressionAndTemp", "expressionEq", "expressionEqTemp", "expressionCmp", 
			"expressionCmpTemp", "expressionAdd", "expressionAddTemp", "expressionMultMod", 
			"expressionMultModTemp", "expressionUnary", "expressionMethods", "expressionMethodsTemp", 
			"expressionOther", "moolaType", "singleType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'inherits'", "':'", "'end'", "'entry'", "'field'", 
			"','", "';'", "'public'", "'private'", "'function'", "'('", "')'", "'returns'", 
			"'if'", "'elif'", "'else'", "'var'", "'='", "'begin'", "'continue'", 
			"'break'", "'return'", "'while'", "'print'", "'++'", "'--'", "'||'", 
			"'&&'", "'=='", "'<>'", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!'", "'.'", "'['", "']'", "'new'", "'self'", "'true'", "'false'", "'int'", 
			"'bool'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CONST_NUM", "CONST_STR", "NL", "ID", "COMMENT", "MULTILINE_COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "Moola.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MoolaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ClassDeclarationContext c1;
		public EntryClassDeclarationContext mainclass;
		public ClassDeclarationContext c3;
		public TerminalNode EOF() { return getToken(MoolaParser.EOF, 0); }
		public EntryClassDeclarationContext entryClassDeclaration() {
			return getRuleContext(EntryClassDeclarationContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(82);
				((ProgramContext)_localctx).c1 = classDeclaration();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			((ProgramContext)_localctx).mainclass = entryClassDeclaration();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(89);
				((ProgramContext)_localctx).c3 = classDeclaration();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(EOF);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token classParent;
		public List<TerminalNode> ID() { return getTokens(MoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MoolaParser.ID, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
			setState(98);
			((ClassDeclarationContext)_localctx).className = match(ID);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(99);
				match(T__1);
				setState(100);
				((ClassDeclarationContext)_localctx).classParent = match(ID);
				}
			}

			setState(103);
			match(T__2);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(104);
					fieldDeclaration();
					}
					break;
				case 2:
					{
					setState(105);
					methodDeclaration();
					}
					break;
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__3);
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

	public static class EntryClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EntryClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterEntryClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitEntryClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitEntryClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryClassDeclarationContext entryClassDeclaration() throws RecognitionException {
		EntryClassDeclarationContext _localctx = new EntryClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entryClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			match(T__4);
			}
			setState(114);
			classDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public Access_modifierContext fieldAccessModifier;
		public Token fieldName;
		public Token ii;
		public MoolaTypeContext fieldType;
		public List<TerminalNode> ID() { return getTokens(MoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MoolaParser.ID, i);
		}
		public MoolaTypeContext moolaType() {
			return getRuleContext(MoolaTypeContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(116);
				((FieldDeclarationContext)_localctx).fieldAccessModifier = access_modifier();
				}
			}

			setState(119);
			match(T__5);
			setState(120);
			((FieldDeclarationContext)_localctx).fieldName = match(ID);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(121);
				match(T__6);
				setState(122);
				((FieldDeclarationContext)_localctx).ii = match(ID);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			((FieldDeclarationContext)_localctx).fieldType = moolaType();
			setState(129);
			match(T__7);
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

	public static class Access_modifierContext extends ParserRuleContext {
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Access_modifierContext methodAccessModifier;
		public Token methodName;
		public Token param1;
		public MoolaTypeContext typeP1;
		public Token param2;
		public MoolaTypeContext typeP2;
		public MoolaTypeContext t;
		public StatementContext s;
		public List<TerminalNode> ID() { return getTokens(MoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MoolaParser.ID, i);
		}
		public List<MoolaTypeContext> moolaType() {
			return getRuleContexts(MoolaTypeContext.class);
		}
		public MoolaTypeContext moolaType(int i) {
			return getRuleContext(MoolaTypeContext.class,i);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(133);
				((MethodDeclarationContext)_localctx).methodAccessModifier = access_modifier();
				}
			}

			setState(136);
			match(T__10);
			setState(137);
			((MethodDeclarationContext)_localctx).methodName = match(ID);
			setState(138);
			match(T__11);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(139);
				((MethodDeclarationContext)_localctx).param1 = match(ID);
				setState(140);
				match(T__2);
				setState(141);
				((MethodDeclarationContext)_localctx).typeP1 = moolaType();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(142);
					match(T__6);
					setState(143);
					((MethodDeclarationContext)_localctx).param2 = match(ID);
					setState(144);
					match(T__2);
					setState(145);
					((MethodDeclarationContext)_localctx).typeP2 = moolaType();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(153);
			match(T__12);
			setState(154);
			match(T__13);
			setState(155);
			((MethodDeclarationContext)_localctx).t = moolaType();
			setState(156);
			match(T__2);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__34) | (1L << T__38) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(157);
				((MethodDeclarationContext)_localctx).s = statement();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__3);
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

	public static class ClosedStatementContext extends ParserRuleContext {
		public StatementBlockContext s1;
		public ClosedConditionalContext conditionalStat;
		public StatementClosedLoopContext s3;
		public StatementWriteContext s4;
		public StatementAssignmentContext s5;
		public StatementReturnContext s6;
		public StatementVarDefContext s7;
		public StatementContinueContext s8;
		public StatementBreakContext s9;
		public StatementIncContext incStat;
		public StatementDecContext decStat;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ClosedConditionalContext closedConditional() {
			return getRuleContext(ClosedConditionalContext.class,0);
		}
		public StatementClosedLoopContext statementClosedLoop() {
			return getRuleContext(StatementClosedLoopContext.class,0);
		}
		public StatementWriteContext statementWrite() {
			return getRuleContext(StatementWriteContext.class,0);
		}
		public StatementAssignmentContext statementAssignment() {
			return getRuleContext(StatementAssignmentContext.class,0);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementVarDefContext statementVarDef() {
			return getRuleContext(StatementVarDefContext.class,0);
		}
		public StatementContinueContext statementContinue() {
			return getRuleContext(StatementContinueContext.class,0);
		}
		public StatementBreakContext statementBreak() {
			return getRuleContext(StatementBreakContext.class,0);
		}
		public StatementIncContext statementInc() {
			return getRuleContext(StatementIncContext.class,0);
		}
		public StatementDecContext statementDec() {
			return getRuleContext(StatementDecContext.class,0);
		}
		public ClosedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterClosedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitClosedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitClosedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedStatementContext closedStatement() throws RecognitionException {
		ClosedStatementContext _localctx = new ClosedStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_closedStatement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((ClosedStatementContext)_localctx).s1 = statementBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				((ClosedStatementContext)_localctx).conditionalStat = closedConditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				((ClosedStatementContext)_localctx).s3 = statementClosedLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				((ClosedStatementContext)_localctx).s4 = statementWrite();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				((ClosedStatementContext)_localctx).s5 = statementAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				((ClosedStatementContext)_localctx).s6 = statementReturn();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				((ClosedStatementContext)_localctx).s7 = statementVarDef();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				((ClosedStatementContext)_localctx).s8 = statementContinue();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(173);
				((ClosedStatementContext)_localctx).s9 = statementBreak();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(174);
				((ClosedStatementContext)_localctx).incStat = statementInc();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(175);
				((ClosedStatementContext)_localctx).decStat = statementDec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(176);
				match(T__7);
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

	public static class ClosedConditionalContext extends ParserRuleContext {
		public ExpressionContext ifExp;
		public ClosedStatementContext ifStat;
		public ExpressionContext elifExp;
		public ClosedStatementContext elifStat;
		public ClosedStatementContext elseStmt;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ClosedStatementContext> closedStatement() {
			return getRuleContexts(ClosedStatementContext.class);
		}
		public ClosedStatementContext closedStatement(int i) {
			return getRuleContext(ClosedStatementContext.class,i);
		}
		public ClosedConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterClosedConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitClosedConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitClosedConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedConditionalContext closedConditional() throws RecognitionException {
		ClosedConditionalContext _localctx = new ClosedConditionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_closedConditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__14);
			setState(180);
			match(T__11);
			setState(181);
			((ClosedConditionalContext)_localctx).ifExp = expression();
			setState(182);
			match(T__12);
			setState(183);
			((ClosedConditionalContext)_localctx).ifStat = closedStatement();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(184);
				match(T__15);
				setState(185);
				match(T__11);
				setState(186);
				((ClosedConditionalContext)_localctx).elifExp = expression();
				setState(187);
				match(T__12);
				setState(188);
				((ClosedConditionalContext)_localctx).elifStat = closedStatement();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__16);
			setState(196);
			((ClosedConditionalContext)_localctx).elseStmt = closedStatement();
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

	public static class OpenConditionalContext extends ParserRuleContext {
		public ExpressionContext ifExp;
		public StatementContext ifStat;
		public ClosedStatementContext secondIfStat;
		public ExpressionContext elifExp;
		public ClosedStatementContext elifStat;
		public ExpressionContext lastElifExp;
		public StatementContext lastElifStmt;
		public ClosedStatementContext thirdIfStat;
		public OpenStatementContext elseStmt;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ClosedStatementContext> closedStatement() {
			return getRuleContexts(ClosedStatementContext.class);
		}
		public ClosedStatementContext closedStatement(int i) {
			return getRuleContext(ClosedStatementContext.class,i);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public OpenConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openConditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterOpenConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitOpenConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitOpenConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenConditionalContext openConditional() throws RecognitionException {
		OpenConditionalContext _localctx = new OpenConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_openConditional);
		int _la;
		try {
			int _alt;
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__14);
				setState(199);
				match(T__11);
				setState(200);
				((OpenConditionalContext)_localctx).ifExp = expression();
				setState(201);
				match(T__12);
				setState(202);
				((OpenConditionalContext)_localctx).ifStat = statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(204);
				match(T__14);
				setState(205);
				match(T__11);
				setState(206);
				((OpenConditionalContext)_localctx).ifExp = expression();
				setState(207);
				match(T__12);
				setState(208);
				((OpenConditionalContext)_localctx).secondIfStat = closedStatement();
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(209);
						match(T__15);
						setState(210);
						match(T__11);
						setState(211);
						((OpenConditionalContext)_localctx).elifExp = expression();
						setState(212);
						match(T__12);
						setState(213);
						((OpenConditionalContext)_localctx).elifStat = closedStatement();
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(220);
				match(T__15);
				setState(221);
				match(T__11);
				setState(222);
				((OpenConditionalContext)_localctx).lastElifExp = expression();
				setState(223);
				match(T__12);
				setState(224);
				((OpenConditionalContext)_localctx).lastElifStmt = statement();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(226);
				match(T__14);
				setState(227);
				match(T__11);
				setState(228);
				((OpenConditionalContext)_localctx).ifExp = expression();
				setState(229);
				match(T__12);
				setState(230);
				((OpenConditionalContext)_localctx).thirdIfStat = closedStatement();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(231);
					match(T__15);
					setState(232);
					match(T__11);
					setState(233);
					((OpenConditionalContext)_localctx).elifExp = expression();
					setState(234);
					match(T__12);
					setState(235);
					((OpenConditionalContext)_localctx).elifStat = closedStatement();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(T__16);
				setState(243);
				((OpenConditionalContext)_localctx).elseStmt = openStatement();
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

	public static class OpenStatementContext extends ParserRuleContext {
		public StatementOpenLoopContext s1;
		public OpenConditionalContext conditionalStat;
		public StatementOpenLoopContext statementOpenLoop() {
			return getRuleContext(StatementOpenLoopContext.class,0);
		}
		public OpenConditionalContext openConditional() {
			return getRuleContext(OpenConditionalContext.class,0);
		}
		public OpenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterOpenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitOpenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitOpenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenStatementContext openStatement() throws RecognitionException {
		OpenStatementContext _localctx = new OpenStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_openStatement);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				((OpenStatementContext)_localctx).s1 = statementOpenLoop();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				((OpenStatementContext)_localctx).conditionalStat = openConditional();
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

	public static class StatementContext extends ParserRuleContext {
		public ClosedStatementContext s1;
		public OpenStatementContext s2;
		public ClosedStatementContext closedStatement() {
			return getRuleContext(ClosedStatementContext.class,0);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((StatementContext)_localctx).s1 = closedStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				((StatementContext)_localctx).s2 = openStatement();
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

	public static class StatementVarDefContext extends ParserRuleContext {
		public Token i1;
		public ExpressionContext e1;
		public Token i2;
		public ExpressionContext e2;
		public List<TerminalNode> ID() { return getTokens(MoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MoolaParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementVarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementVarDefContext statementVarDef() throws RecognitionException {
		StatementVarDefContext _localctx = new StatementVarDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementVarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__17);
			setState(256);
			((StatementVarDefContext)_localctx).i1 = match(ID);
			setState(257);
			match(T__18);
			setState(258);
			((StatementVarDefContext)_localctx).e1 = expression();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(259);
				match(T__6);
				setState(260);
				((StatementVarDefContext)_localctx).i2 = match(ID);
				setState(261);
				match(T__18);
				setState(262);
				((StatementVarDefContext)_localctx).e2 = expression();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(T__7);
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

	public static class StatementBlockContext extends ParserRuleContext {
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__19);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__34) | (1L << T__38) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(271);
				((StatementBlockContext)_localctx).s = statement();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(T__3);
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

	public static class StatementContinueContext extends ParserRuleContext {
		public Token myContinue;
		public StatementContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementContinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContinueContext statementContinue() throws RecognitionException {
		StatementContinueContext _localctx = new StatementContinueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statementContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			((StatementContinueContext)_localctx).myContinue = match(T__20);
			setState(280);
			match(T__7);
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

	public static class StatementBreakContext extends ParserRuleContext {
		public Token myBreak;
		public StatementBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBreakContext statementBreak() throws RecognitionException {
		StatementBreakContext _localctx = new StatementBreakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((StatementBreakContext)_localctx).myBreak = match(T__21);
			setState(283);
			match(T__7);
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

	public static class StatementReturnContext extends ParserRuleContext {
		public Token myReturn;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReturnContext statementReturn() throws RecognitionException {
		StatementReturnContext _localctx = new StatementReturnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			((StatementReturnContext)_localctx).myReturn = match(T__22);
			setState(286);
			((StatementReturnContext)_localctx).e = expression();
			setState(287);
			match(T__7);
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

	public static class StatementClosedLoopContext extends ParserRuleContext {
		public ExpressionContext e;
		public ClosedStatementContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClosedStatementContext closedStatement() {
			return getRuleContext(ClosedStatementContext.class,0);
		}
		public StatementClosedLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementClosedLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementClosedLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementClosedLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementClosedLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementClosedLoopContext statementClosedLoop() throws RecognitionException {
		StatementClosedLoopContext _localctx = new StatementClosedLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementClosedLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__23);
			setState(290);
			match(T__11);
			setState(291);
			((StatementClosedLoopContext)_localctx).e = expression();
			setState(292);
			match(T__12);
			setState(293);
			((StatementClosedLoopContext)_localctx).s = closedStatement();
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

	public static class StatementOpenLoopContext extends ParserRuleContext {
		public ExpressionContext e;
		public OpenStatementContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public StatementOpenLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOpenLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementOpenLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementOpenLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementOpenLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementOpenLoopContext statementOpenLoop() throws RecognitionException {
		StatementOpenLoopContext _localctx = new StatementOpenLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statementOpenLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__23);
			setState(296);
			match(T__11);
			setState(297);
			((StatementOpenLoopContext)_localctx).e = expression();
			setState(298);
			match(T__12);
			setState(299);
			((StatementOpenLoopContext)_localctx).s = openStatement();
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

	public static class StatementWriteContext extends ParserRuleContext {
		public Token printLine;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWriteContext statementWrite() throws RecognitionException {
		StatementWriteContext _localctx = new StatementWriteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((StatementWriteContext)_localctx).printLine = match(T__24);
			setState(302);
			match(T__11);
			setState(303);
			((StatementWriteContext)_localctx).e = expression();
			setState(304);
			match(T__12);
			setState(305);
			match(T__7);
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

	public static class StatementAssignmentContext extends ParserRuleContext {
		public ExpressionContext left;
		public Token assignOp;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignmentContext statementAssignment() throws RecognitionException {
		StatementAssignmentContext _localctx = new StatementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((StatementAssignmentContext)_localctx).left = expression();
			setState(308);
			((StatementAssignmentContext)_localctx).assignOp = match(T__18);
			setState(309);
			((StatementAssignmentContext)_localctx).right = expression();
			setState(310);
			match(T__7);
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

	public static class StatementIncContext extends ParserRuleContext {
		public ExpressionContext lvalExpr;
		public Token incOp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementInc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIncContext statementInc() throws RecognitionException {
		StatementIncContext _localctx = new StatementIncContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementInc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((StatementIncContext)_localctx).lvalExpr = expression();
			setState(313);
			((StatementIncContext)_localctx).incOp = match(T__25);
			setState(314);
			match(T__7);
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

	public static class StatementDecContext extends ParserRuleContext {
		public ExpressionContext lvalExpr;
		public Token decOp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterStatementDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitStatementDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitStatementDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDecContext statementDec() throws RecognitionException {
		StatementDecContext _localctx = new StatementDecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((StatementDecContext)_localctx).lvalExpr = expression();
			setState(317);
			((StatementDecContext)_localctx).decOp = match(T__26);
			setState(318);
			match(T__7);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionOrContext e;
		public ExpressionOrContext expressionOr() {
			return getRuleContext(ExpressionOrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			((ExpressionContext)_localctx).e = expressionOr();
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

	public static class ExpressionOrContext extends ParserRuleContext {
		public ExpressionAndContext a;
		public ExpressionOrTempContext ot;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrContext expressionOr() throws RecognitionException {
		ExpressionOrContext _localctx = new ExpressionOrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			((ExpressionOrContext)_localctx).a = expressionAnd();
			setState(323);
			((ExpressionOrContext)_localctx).ot = expressionOrTemp();
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

	public static class ExpressionOrTempContext extends ParserRuleContext {
		public Token orOp;
		public ExpressionAndContext a;
		public ExpressionOrTempContext ot;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionOrTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionOrTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionOrTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrTempContext expressionOrTemp() throws RecognitionException {
		ExpressionOrTempContext _localctx = new ExpressionOrTempContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionOrTemp);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				((ExpressionOrTempContext)_localctx).orOp = match(T__27);
				setState(326);
				((ExpressionOrTempContext)_localctx).a = expressionAnd();
				setState(327);
				((ExpressionOrTempContext)_localctx).ot = expressionOrTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionAndContext extends ParserRuleContext {
		public ExpressionEqContext e;
		public ExpressionAndTempContext at;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAndContext expressionAnd() throws RecognitionException {
		ExpressionAndContext _localctx = new ExpressionAndContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			((ExpressionAndContext)_localctx).e = expressionEq();
			setState(333);
			((ExpressionAndContext)_localctx).at = expressionAndTemp();
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

	public static class ExpressionAndTempContext extends ParserRuleContext {
		public Token andOp;
		public ExpressionEqContext e;
		public ExpressionAndTempContext at;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAndTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionAndTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionAndTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionAndTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAndTempContext expressionAndTemp() throws RecognitionException {
		ExpressionAndTempContext _localctx = new ExpressionAndTempContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionAndTemp);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				((ExpressionAndTempContext)_localctx).andOp = match(T__28);
				setState(336);
				((ExpressionAndTempContext)_localctx).e = expressionEq();
				setState(337);
				((ExpressionAndTempContext)_localctx).at = expressionAndTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionEqContext extends ParserRuleContext {
		public ExpressionCmpContext c;
		public ExpressionEqTempContext et;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionEqContext expressionEq() throws RecognitionException {
		ExpressionEqContext _localctx = new ExpressionEqContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((ExpressionEqContext)_localctx).c = expressionCmp();
			setState(343);
			((ExpressionEqContext)_localctx).et = expressionEqTemp();
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

	public static class ExpressionEqTempContext extends ParserRuleContext {
		public Token eqOp;
		public Token neqOp;
		public ExpressionCmpContext c;
		public ExpressionEqTempContext et;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEqTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionEqTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionEqTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionEqTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionEqTempContext expressionEqTemp() throws RecognitionException {
		ExpressionEqTempContext _localctx = new ExpressionEqTempContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionEqTemp);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(345);
					((ExpressionEqTempContext)_localctx).eqOp = match(T__29);
					}
					break;
				case T__30:
					{
					setState(346);
					((ExpressionEqTempContext)_localctx).neqOp = match(T__30);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(349);
				((ExpressionEqTempContext)_localctx).c = expressionCmp();
				setState(350);
				((ExpressionEqTempContext)_localctx).et = expressionEqTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionCmpContext extends ParserRuleContext {
		public ExpressionAddContext a;
		public ExpressionCmpTempContext ct;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionCmpContext expressionCmp() throws RecognitionException {
		ExpressionCmpContext _localctx = new ExpressionCmpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionCmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			((ExpressionCmpContext)_localctx).a = expressionAdd();
			setState(356);
			((ExpressionCmpContext)_localctx).ct = expressionCmpTemp();
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

	public static class ExpressionCmpTempContext extends ParserRuleContext {
		public Token ltOp;
		public Token gtOp;
		public ExpressionAddContext a;
		public ExpressionCmpTempContext ct;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCmpTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionCmpTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionCmpTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionCmpTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionCmpTempContext expressionCmpTemp() throws RecognitionException {
		ExpressionCmpTempContext _localctx = new ExpressionCmpTempContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionCmpTemp);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__31:
					{
					setState(358);
					((ExpressionCmpTempContext)_localctx).ltOp = match(T__31);
					}
					break;
				case T__32:
					{
					setState(359);
					((ExpressionCmpTempContext)_localctx).gtOp = match(T__32);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(362);
				((ExpressionCmpTempContext)_localctx).a = expressionAdd();
				setState(363);
				((ExpressionCmpTempContext)_localctx).ct = expressionCmpTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionAddContext extends ParserRuleContext {
		public ExpressionMultModContext m;
		public ExpressionAddTempContext at;
		public ExpressionMultModContext expressionMultMod() {
			return getRuleContext(ExpressionMultModContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAddContext expressionAdd() throws RecognitionException {
		ExpressionAddContext _localctx = new ExpressionAddContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((ExpressionAddContext)_localctx).m = expressionMultMod();
			setState(369);
			((ExpressionAddContext)_localctx).at = expressionAddTemp();
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

	public static class ExpressionAddTempContext extends ParserRuleContext {
		public Token addOp;
		public Token subOp;
		public ExpressionMultModContext m;
		public ExpressionAddTempContext at;
		public ExpressionMultModContext expressionMultMod() {
			return getRuleContext(ExpressionMultModContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAddTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionAddTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionAddTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionAddTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAddTempContext expressionAddTemp() throws RecognitionException {
		ExpressionAddTempContext _localctx = new ExpressionAddTempContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionAddTemp);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__33:
					{
					setState(371);
					((ExpressionAddTempContext)_localctx).addOp = match(T__33);
					}
					break;
				case T__34:
					{
					setState(372);
					((ExpressionAddTempContext)_localctx).subOp = match(T__34);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(375);
				((ExpressionAddTempContext)_localctx).m = expressionMultMod();
				setState(376);
				((ExpressionAddTempContext)_localctx).at = expressionAddTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionMultModContext extends ParserRuleContext {
		public ExpressionUnaryContext u;
		public ExpressionMultModTempContext mt;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultModTempContext expressionMultModTemp() {
			return getRuleContext(ExpressionMultModTempContext.class,0);
		}
		public ExpressionMultModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMultMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionMultMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionMultMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionMultMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMultModContext expressionMultMod() throws RecognitionException {
		ExpressionMultModContext _localctx = new ExpressionMultModContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionMultMod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((ExpressionMultModContext)_localctx).u = expressionUnary();
			setState(382);
			((ExpressionMultModContext)_localctx).mt = expressionMultModTemp();
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

	public static class ExpressionMultModTempContext extends ParserRuleContext {
		public Token mulOp;
		public Token divOp;
		public Token modOp;
		public ExpressionUnaryContext u;
		public ExpressionMultModTempContext mt;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultModTempContext expressionMultModTemp() {
			return getRuleContext(ExpressionMultModTempContext.class,0);
		}
		public ExpressionMultModTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMultModTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionMultModTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionMultModTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionMultModTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMultModTempContext expressionMultModTemp() throws RecognitionException {
		ExpressionMultModTempContext _localctx = new ExpressionMultModTempContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionMultModTemp);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(384);
					((ExpressionMultModTempContext)_localctx).mulOp = match(T__35);
					}
					break;
				case T__36:
					{
					setState(385);
					((ExpressionMultModTempContext)_localctx).divOp = match(T__36);
					}
					break;
				case T__37:
					{
					setState(386);
					((ExpressionMultModTempContext)_localctx).modOp = match(T__37);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(389);
				((ExpressionMultModTempContext)_localctx).u = expressionUnary();
				setState(390);
				((ExpressionMultModTempContext)_localctx).mt = expressionMultModTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionUnaryContext extends ParserRuleContext {
		public Token notOp;
		public Token negOp;
		public ExpressionUnaryContext u;
		public ExpressionMethodsContext m;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMethodsContext expressionMethods() {
			return getRuleContext(ExpressionMethodsContext.class,0);
		}
		public ExpressionUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionUnaryContext expressionUnary() throws RecognitionException {
		ExpressionUnaryContext _localctx = new ExpressionUnaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressionUnary);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__38:
					{
					setState(395);
					((ExpressionUnaryContext)_localctx).notOp = match(T__38);
					}
					break;
				case T__34:
					{
					setState(396);
					((ExpressionUnaryContext)_localctx).negOp = match(T__34);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(399);
				((ExpressionUnaryContext)_localctx).u = expressionUnary();
				}
				break;
			case T__11:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case CONST_NUM:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				((ExpressionUnaryContext)_localctx).m = expressionMethods();
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

	public static class ExpressionMethodsContext extends ParserRuleContext {
		public ExpressionOtherContext o;
		public ExpressionMethodsTempContext mt;
		public ExpressionOtherContext expressionOther() {
			return getRuleContext(ExpressionOtherContext.class,0);
		}
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public ExpressionMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodsContext expressionMethods() throws RecognitionException {
		ExpressionMethodsContext _localctx = new ExpressionMethodsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((ExpressionMethodsContext)_localctx).o = expressionOther();
			setState(404);
			((ExpressionMethodsContext)_localctx).mt = expressionMethodsTemp();
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

	public static class ExpressionMethodsTempContext extends ParserRuleContext {
		public Token dotOp;
		public Token i;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token ii;
		public Token leftBrace;
		public ExpressionContext e3;
		public ExpressionMethodsTempContext mt;
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public TerminalNode ID() { return getToken(MoolaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodsTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionMethodsTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionMethodsTemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionMethodsTemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodsTempContext expressionMethodsTemp() throws RecognitionException {
		ExpressionMethodsTempContext _localctx = new ExpressionMethodsTempContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionMethodsTemp);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(406);
					((ExpressionMethodsTempContext)_localctx).dotOp = match(T__39);
					setState(407);
					((ExpressionMethodsTempContext)_localctx).i = match(ID);
					setState(408);
					match(T__11);
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__34) | (1L << T__38) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
						{
						setState(409);
						((ExpressionMethodsTempContext)_localctx).e1 = expression();
						setState(414);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__6) {
							{
							{
							setState(410);
							match(T__6);
							setState(411);
							((ExpressionMethodsTempContext)_localctx).e2 = expression();
							}
							}
							setState(416);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(419);
					match(T__12);
					}
					break;
				case 2:
					{
					setState(420);
					((ExpressionMethodsTempContext)_localctx).dotOp = match(T__39);
					setState(421);
					((ExpressionMethodsTempContext)_localctx).ii = match(ID);
					}
					break;
				case 3:
					{
					setState(422);
					((ExpressionMethodsTempContext)_localctx).leftBrace = match(T__40);
					setState(423);
					((ExpressionMethodsTempContext)_localctx).e3 = expression();
					setState(424);
					match(T__41);
					}
					break;
				}
				setState(428);
				((ExpressionMethodsTempContext)_localctx).mt = expressionMethodsTemp();
				}
				break;
			case T__6:
			case T__7:
			case T__12:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionOtherContext extends ParserRuleContext {
		public Token n;
		public Token s;
		public Token newModifier;
		public SingleTypeContext st;
		public Token leftBrace;
		public ExpressionContext size;
		public Token i;
		public Token selfModifier;
		public Token trueModifier;
		public Token falseModifier;
		public Token i1;
		public Token i2;
		public ExpressionContext e;
		public Token leftPara;
		public ExpressionContext ee;
		public Token i3;
		public ExpressionContext e3;
		public ExpressionContext e4;
		public TerminalNode CONST_NUM() { return getToken(MoolaParser.CONST_NUM, 0); }
		public TerminalNode CONST_STR() { return getToken(MoolaParser.CONST_STR, 0); }
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(MoolaParser.ID, 0); }
		public ExpressionOtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOther; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterExpressionOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitExpressionOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitExpressionOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOtherContext expressionOther() throws RecognitionException {
		ExpressionOtherContext _localctx = new ExpressionOtherContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionOther);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				((ExpressionOtherContext)_localctx).n = match(CONST_NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				((ExpressionOtherContext)_localctx).s = match(CONST_STR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				((ExpressionOtherContext)_localctx).newModifier = match(T__42);
				setState(435);
				((ExpressionOtherContext)_localctx).st = singleType();
				setState(436);
				((ExpressionOtherContext)_localctx).leftBrace = match(T__40);
				setState(437);
				((ExpressionOtherContext)_localctx).size = expression();
				setState(438);
				match(T__41);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				((ExpressionOtherContext)_localctx).newModifier = match(T__42);
				setState(441);
				((ExpressionOtherContext)_localctx).i = match(ID);
				setState(442);
				match(T__11);
				setState(443);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				((ExpressionOtherContext)_localctx).selfModifier = match(T__43);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(445);
				((ExpressionOtherContext)_localctx).trueModifier = match(T__44);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(446);
				((ExpressionOtherContext)_localctx).falseModifier = match(T__45);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(447);
				((ExpressionOtherContext)_localctx).i1 = match(ID);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(448);
				((ExpressionOtherContext)_localctx).i2 = match(ID);
				setState(449);
				((ExpressionOtherContext)_localctx).leftBrace = match(T__40);
				setState(450);
				((ExpressionOtherContext)_localctx).e = expression();
				setState(451);
				match(T__41);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(453);
				((ExpressionOtherContext)_localctx).leftPara = match(T__11);
				setState(454);
				((ExpressionOtherContext)_localctx).ee = expression();
				setState(455);
				match(T__12);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(457);
				((ExpressionOtherContext)_localctx).i3 = match(ID);
				setState(458);
				match(T__11);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__34) | (1L << T__38) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
					{
					setState(459);
					((ExpressionOtherContext)_localctx).e3 = expression();
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(460);
						match(T__6);
						setState(461);
						((ExpressionOtherContext)_localctx).e4 = expression();
						}
						}
						setState(466);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(469);
				match(T__12);
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

	public static class MoolaTypeContext extends ParserRuleContext {
		public SingleTypeContext st;
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public MoolaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moolaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterMoolaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitMoolaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitMoolaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoolaTypeContext moolaType() throws RecognitionException {
		MoolaTypeContext _localctx = new MoolaTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_moolaType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			((MoolaTypeContext)_localctx).st = singleType();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(473);
				match(T__40);
				setState(474);
				match(T__41);
				}
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

	public static class SingleTypeContext extends ParserRuleContext {
		public Token i;
		public TerminalNode ID() { return getToken(MoolaParser.ID, 0); }
		public SingleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).enterSingleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoolaListener ) ((MoolaListener)listener).exitSingleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoolaVisitor ) return ((MoolaVisitor<? extends T>)visitor).visitSingleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeContext singleType() throws RecognitionException {
		SingleTypeContext _localctx = new SingleTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_singleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				{
				setState(477);
				match(T__46);
				}
				break;
			case T__47:
				{
				setState(478);
				match(T__47);
				}
				break;
			case T__48:
				{
				setState(479);
				match(T__48);
				}
				break;
			case ID:
				{
				setState(480);
				((SingleTypeContext)_localctx).i = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\7\2"+
		"V\n\2\f\2\16\2Y\13\2\3\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3h\n\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\5\5x\n\5\3\5\3\5\3\5\3\5\7\5~\n\5\f\5\16\5\u0081\13\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\5\7\u0089\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u0095\n\7\f\7\16\7\u0098\13\7\5\7\u009a\n\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00a1\n\7\f\7\16\7\u00a4\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00b4\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u00c1\n\t\f\t\16\t\u00c4\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00da\n\n\f\n\16"+
		"\n\u00dd\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00f0\n\n\f\n\16\n\u00f3\13\n\3\n\3\n\3\n\5\n\u00f8\n"+
		"\n\3\13\3\13\5\13\u00fc\n\13\3\f\3\f\5\f\u0100\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u010a\n\r\f\r\16\r\u010d\13\r\3\r\3\r\3\16\3\16\7\16"+
		"\u0113\n\16\f\16\16\16\u0116\13\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u014d\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0157\n\34\3\35\3\35\3\35\3\36\3\36\5\36\u015e\n\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0164\n\36\3\37\3\37\3\37\3 \3 \5 \u016b\n \3 \3 \3"+
		" \3 \5 \u0171\n \3!\3!\3!\3\"\3\"\5\"\u0178\n\"\3\"\3\"\3\"\3\"\5\"\u017e"+
		"\n\"\3#\3#\3#\3$\3$\3$\5$\u0186\n$\3$\3$\3$\3$\5$\u018c\n$\3%\3%\5%\u0190"+
		"\n%\3%\3%\5%\u0194\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u019f\n\'\f"+
		"\'\16\'\u01a2\13\'\5\'\u01a4\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01ad"+
		"\n\'\3\'\3\'\5\'\u01b1\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u01d1\n(\f(\16(\u01d4"+
		"\13(\5(\u01d6\n(\3(\5(\u01d9\n(\3)\3)\3)\5)\u01de\n)\3*\3*\3*\3*\5*\u01e4"+
		"\n*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPR\2\3\3\2\13\f\2\u01fd\2W\3\2\2\2\4c\3\2\2\2\6s\3\2\2\2\b"+
		"w\3\2\2\2\n\u0085\3\2\2\2\f\u0088\3\2\2\2\16\u00b3\3\2\2\2\20\u00b5\3"+
		"\2\2\2\22\u00f7\3\2\2\2\24\u00fb\3\2\2\2\26\u00ff\3\2\2\2\30\u0101\3\2"+
		"\2\2\32\u0110\3\2\2\2\34\u0119\3\2\2\2\36\u011c\3\2\2\2 \u011f\3\2\2\2"+
		"\"\u0123\3\2\2\2$\u0129\3\2\2\2&\u012f\3\2\2\2(\u0135\3\2\2\2*\u013a\3"+
		"\2\2\2,\u013e\3\2\2\2.\u0142\3\2\2\2\60\u0144\3\2\2\2\62\u014c\3\2\2\2"+
		"\64\u014e\3\2\2\2\66\u0156\3\2\2\28\u0158\3\2\2\2:\u0163\3\2\2\2<\u0165"+
		"\3\2\2\2>\u0170\3\2\2\2@\u0172\3\2\2\2B\u017d\3\2\2\2D\u017f\3\2\2\2F"+
		"\u018b\3\2\2\2H\u0193\3\2\2\2J\u0195\3\2\2\2L\u01b0\3\2\2\2N\u01d8\3\2"+
		"\2\2P\u01da\3\2\2\2R\u01e3\3\2\2\2TV\5\4\3\2UT\3\2\2\2VY\3\2\2\2WU\3\2"+
		"\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z^\5\6\4\2[]\5\4\3\2\\[\3\2\2\2]`\3"+
		"\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\2\2\3b\3\3\2\2\2c"+
		"d\7\3\2\2dg\7\67\2\2ef\7\4\2\2fh\7\67\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2"+
		"\2in\7\5\2\2jm\5\b\5\2km\5\f\7\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\6\2\2r\5\3\2\2\2st\7\7\2\2tu\5\4"+
		"\3\2u\7\3\2\2\2vx\5\n\6\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\b\2\2z\177"+
		"\7\67\2\2{|\7\t\2\2|~\7\67\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5P)\2"+
		"\u0083\u0084\7\n\2\2\u0084\t\3\2\2\2\u0085\u0086\t\2\2\2\u0086\13\3\2"+
		"\2\2\u0087\u0089\5\n\6\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\7\r\2\2\u008b\u008c\7\67\2\2\u008c\u0099\7"+
		"\16\2\2\u008d\u008e\7\67\2\2\u008e\u008f\7\5\2\2\u008f\u0096\5P)\2\u0090"+
		"\u0091\7\t\2\2\u0091\u0092\7\67\2\2\u0092\u0093\7\5\2\2\u0093\u0095\5"+
		"P)\2\u0094\u0090\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u008d\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\17\2\2\u009c"+
		"\u009d\7\20\2\2\u009d\u009e\5P)\2\u009e\u00a2\7\5\2\2\u009f\u00a1\5\26"+
		"\f\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\6"+
		"\2\2\u00a6\r\3\2\2\2\u00a7\u00b4\5\32\16\2\u00a8\u00b4\5\20\t\2\u00a9"+
		"\u00b4\5\"\22\2\u00aa\u00b4\5&\24\2\u00ab\u00b4\5(\25\2\u00ac\u00b4\5"+
		" \21\2\u00ad\u00b4\5\30\r\2\u00ae\u00b4\5\34\17\2\u00af\u00b4\5\36\20"+
		"\2\u00b0\u00b4\5*\26\2\u00b1\u00b4\5,\27\2\u00b2\u00b4\7\n\2\2\u00b3\u00a7"+
		"\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3"+
		"\u00ab\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00ae\3\2"+
		"\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\17\3\2\2\2\u00b5\u00b6\7\21\2\2\u00b6\u00b7\7\16"+
		"\2\2\u00b7\u00b8\5.\30\2\u00b8\u00b9\7\17\2\2\u00b9\u00c2\5\16\b\2\u00ba"+
		"\u00bb\7\22\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\5.\30\2\u00bd\u00be\7"+
		"\17\2\2\u00be\u00bf\5\16\b\2\u00bf\u00c1\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\23\2\2\u00c6\u00c7\5\16\b\2\u00c7"+
		"\21\3\2\2\2\u00c8\u00c9\7\21\2\2\u00c9\u00ca\7\16\2\2\u00ca\u00cb\5.\30"+
		"\2\u00cb\u00cc\7\17\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00f8\3\2\2\2\u00ce"+
		"\u00cf\7\21\2\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\5.\30\2\u00d1\u00d2\7"+
		"\17\2\2\u00d2\u00db\5\16\b\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5\7\16\2\2"+
		"\u00d5\u00d6\5.\30\2\u00d6\u00d7\7\17\2\2\u00d7\u00d8\5\16\b\2\u00d8\u00da"+
		"\3\2\2\2\u00d9\u00d3\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\22"+
		"\2\2\u00df\u00e0\7\16\2\2\u00e0\u00e1\5.\30\2\u00e1\u00e2\7\17\2\2\u00e2"+
		"\u00e3\5\26\f\2\u00e3\u00f8\3\2\2\2\u00e4\u00e5\7\21\2\2\u00e5\u00e6\7"+
		"\16\2\2\u00e6\u00e7\5.\30\2\u00e7\u00e8\7\17\2\2\u00e8\u00f1\5\16\b\2"+
		"\u00e9\u00ea\7\22\2\2\u00ea\u00eb\7\16\2\2\u00eb\u00ec\5.\30\2\u00ec\u00ed"+
		"\7\17\2\2\u00ed\u00ee\5\16\b\2\u00ee\u00f0\3\2\2\2\u00ef\u00e9\3\2\2\2"+
		"\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\23\2\2\u00f5\u00f6\5\24\13"+
		"\2\u00f6\u00f8\3\2\2\2\u00f7\u00c8\3\2\2\2\u00f7\u00ce\3\2\2\2\u00f7\u00e4"+
		"\3\2\2\2\u00f8\23\3\2\2\2\u00f9\u00fc\5$\23\2\u00fa\u00fc\5\22\n\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\25\3\2\2\2\u00fd\u0100\5\16\b"+
		"\2\u00fe\u0100\5\24\13\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\27\3\2\2\2\u0101\u0102\7\24\2\2\u0102\u0103\7\67\2\2\u0103\u0104\7\25"+
		"\2\2\u0104\u010b\5.\30\2\u0105\u0106\7\t\2\2\u0106\u0107\7\67\2\2\u0107"+
		"\u0108\7\25\2\2\u0108\u010a\5.\30\2\u0109\u0105\3\2\2\2\u010a\u010d\3"+
		"\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7\n\2\2\u010f\31\3\2\2\2\u0110\u0114\7\26\2"+
		"\2\u0111\u0113\5\26\f\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u0118\7\6\2\2\u0118\33\3\2\2\2\u0119\u011a\7\27\2\2\u011a\u011b"+
		"\7\n\2\2\u011b\35\3\2\2\2\u011c\u011d\7\30\2\2\u011d\u011e\7\n\2\2\u011e"+
		"\37\3\2\2\2\u011f\u0120\7\31\2\2\u0120\u0121\5.\30\2\u0121\u0122\7\n\2"+
		"\2\u0122!\3\2\2\2\u0123\u0124\7\32\2\2\u0124\u0125\7\16\2\2\u0125\u0126"+
		"\5.\30\2\u0126\u0127\7\17\2\2\u0127\u0128\5\16\b\2\u0128#\3\2\2\2\u0129"+
		"\u012a\7\32\2\2\u012a\u012b\7\16\2\2\u012b\u012c\5.\30\2\u012c\u012d\7"+
		"\17\2\2\u012d\u012e\5\24\13\2\u012e%\3\2\2\2\u012f\u0130\7\33\2\2\u0130"+
		"\u0131\7\16\2\2\u0131\u0132\5.\30\2\u0132\u0133\7\17\2\2\u0133\u0134\7"+
		"\n\2\2\u0134\'\3\2\2\2\u0135\u0136\5.\30\2\u0136\u0137\7\25\2\2\u0137"+
		"\u0138\5.\30\2\u0138\u0139\7\n\2\2\u0139)\3\2\2\2\u013a\u013b\5.\30\2"+
		"\u013b\u013c\7\34\2\2\u013c\u013d\7\n\2\2\u013d+\3\2\2\2\u013e\u013f\5"+
		".\30\2\u013f\u0140\7\35\2\2\u0140\u0141\7\n\2\2\u0141-\3\2\2\2\u0142\u0143"+
		"\5\60\31\2\u0143/\3\2\2\2\u0144\u0145\5\64\33\2\u0145\u0146\5\62\32\2"+
		"\u0146\61\3\2\2\2\u0147\u0148\7\36\2\2\u0148\u0149\5\64\33\2\u0149\u014a"+
		"\5\62\32\2\u014a\u014d\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u0147\3\2\2\2"+
		"\u014c\u014b\3\2\2\2\u014d\63\3\2\2\2\u014e\u014f\58\35\2\u014f\u0150"+
		"\5\66\34\2\u0150\65\3\2\2\2\u0151\u0152\7\37\2\2\u0152\u0153\58\35\2\u0153"+
		"\u0154\5\66\34\2\u0154\u0157\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0151\3"+
		"\2\2\2\u0156\u0155\3\2\2\2\u0157\67\3\2\2\2\u0158\u0159\5<\37\2\u0159"+
		"\u015a\5:\36\2\u015a9\3\2\2\2\u015b\u015e\7 \2\2\u015c\u015e\7!\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\5<"+
		"\37\2\u0160\u0161\5:\36\2\u0161\u0164\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u015d\3\2\2\2\u0163\u0162\3\2\2\2\u0164;\3\2\2\2\u0165\u0166\5@!\2\u0166"+
		"\u0167\5> \2\u0167=\3\2\2\2\u0168\u016b\7\"\2\2\u0169\u016b\7#\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\5@"+
		"!\2\u016d\u016e\5> \2\u016e\u0171\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016a"+
		"\3\2\2\2\u0170\u016f\3\2\2\2\u0171?\3\2\2\2\u0172\u0173\5D#\2\u0173\u0174"+
		"\5B\"\2\u0174A\3\2\2\2\u0175\u0178\7$\2\2\u0176\u0178\7%\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\5D#\2\u017a"+
		"\u017b\5B\"\2\u017b\u017e\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u0177\3\2"+
		"\2\2\u017d\u017c\3\2\2\2\u017eC\3\2\2\2\u017f\u0180\5H%\2\u0180\u0181"+
		"\5F$\2\u0181E\3\2\2\2\u0182\u0186\7&\2\2\u0183\u0186\7\'\2\2\u0184\u0186"+
		"\7(\2\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\5H%\2\u0188\u0189\5F$\2\u0189\u018c\3\2\2\2"+
		"\u018a\u018c\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u018a\3\2\2\2\u018cG\3"+
		"\2\2\2\u018d\u0190\7)\2\2\u018e\u0190\7%\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0194\5H%\2\u0192\u0194\5J&\2"+
		"\u0193\u018f\3\2\2\2\u0193\u0192\3\2\2\2\u0194I\3\2\2\2\u0195\u0196\5"+
		"N(\2\u0196\u0197\5L\'\2\u0197K\3\2\2\2\u0198\u0199\7*\2\2\u0199\u019a"+
		"\7\67\2\2\u019a\u01a3\7\16\2\2\u019b\u01a0\5.\30\2\u019c\u019d\7\t\2\2"+
		"\u019d\u019f\5.\30\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u019b\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01ad\7\17"+
		"\2\2\u01a6\u01a7\7*\2\2\u01a7\u01ad\7\67\2\2\u01a8\u01a9\7+\2\2\u01a9"+
		"\u01aa\5.\30\2\u01aa\u01ab\7,\2\2\u01ab\u01ad\3\2\2\2\u01ac\u0198\3\2"+
		"\2\2\u01ac\u01a6\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b1\5L\'\2\u01af\u01b1\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b0\u01af\3\2"+
		"\2\2\u01b1M\3\2\2\2\u01b2\u01d9\7\64\2\2\u01b3\u01d9\7\65\2\2\u01b4\u01b5"+
		"\7-\2\2\u01b5\u01b6\5R*\2\u01b6\u01b7\7+\2\2\u01b7\u01b8\5.\30\2\u01b8"+
		"\u01b9\7,\2\2\u01b9\u01d9\3\2\2\2\u01ba\u01bb\7-\2\2\u01bb\u01bc\7\67"+
		"\2\2\u01bc\u01bd\7\16\2\2\u01bd\u01d9\7\17\2\2\u01be\u01d9\7.\2\2\u01bf"+
		"\u01d9\7/\2\2\u01c0\u01d9\7\60\2\2\u01c1\u01d9\7\67\2\2\u01c2\u01c3\7"+
		"\67\2\2\u01c3\u01c4\7+\2\2\u01c4\u01c5\5.\30\2\u01c5\u01c6\7,\2\2\u01c6"+
		"\u01d9\3\2\2\2\u01c7\u01c8\7\16\2\2\u01c8\u01c9\5.\30\2\u01c9\u01ca\7"+
		"\17\2\2\u01ca\u01d9\3\2\2\2\u01cb\u01cc\7\67\2\2\u01cc\u01d5\7\16\2\2"+
		"\u01cd\u01d2\5.\30\2\u01ce\u01cf\7\t\2\2\u01cf\u01d1\5.\30\2\u01d0\u01ce"+
		"\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01cd\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\7\17\2\2\u01d8\u01b2\3\2\2\2\u01d8"+
		"\u01b3\3\2\2\2\u01d8\u01b4\3\2\2\2\u01d8\u01ba\3\2\2\2\u01d8\u01be\3\2"+
		"\2\2\u01d8\u01bf\3\2\2\2\u01d8\u01c0\3\2\2\2\u01d8\u01c1\3\2\2\2\u01d8"+
		"\u01c2\3\2\2\2\u01d8\u01c7\3\2\2\2\u01d8\u01cb\3\2\2\2\u01d9O\3\2\2\2"+
		"\u01da\u01dd\5R*\2\u01db\u01dc\7+\2\2\u01dc\u01de\7,\2\2\u01dd\u01db\3"+
		"\2\2\2\u01dd\u01de\3\2\2\2\u01deQ\3\2\2\2\u01df\u01e4\7\61\2\2\u01e0\u01e4"+
		"\7\62\2\2\u01e1\u01e4\7\63\2\2\u01e2\u01e4\7\67\2\2\u01e3\u01df\3\2\2"+
		"\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4S"+
		"\3\2\2\2+W^glnw\177\u0088\u0096\u0099\u00a2\u00b3\u00c2\u00db\u00f1\u00f7"+
		"\u00fb\u00ff\u010b\u0114\u014c\u0156\u015d\u0163\u016a\u0170\u0177\u017d"+
		"\u0185\u018b\u018f\u0193\u01a0\u01a3\u01ac\u01b0\u01d2\u01d5\u01d8\u01dd"+
		"\u01e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}