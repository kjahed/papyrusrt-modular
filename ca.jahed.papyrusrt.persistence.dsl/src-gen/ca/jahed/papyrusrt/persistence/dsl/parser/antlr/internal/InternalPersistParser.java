package ca.jahed.papyrusrt.persistence.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ca.jahed.papyrusrt.persistence.dsl.services.PersistGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersistParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'rule'", "'foreach'", "'create'", "'folder'", "'save'", "'in'", "'+'", "'include'", "','", "'with'", "'referencing'", "'call'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPersistParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPersistParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPersistParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPersist.g"; }



     	private PersistGrammarAccess grammarAccess;

        public InternalPersistParser(TokenStream input, PersistGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Persist";
       	}

       	@Override
       	protected PersistGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePersist"
    // InternalPersist.g:64:1: entryRulePersist returns [EObject current=null] : iv_rulePersist= rulePersist EOF ;
    public final EObject entryRulePersist() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersist = null;


        try {
            // InternalPersist.g:64:48: (iv_rulePersist= rulePersist EOF )
            // InternalPersist.g:65:2: iv_rulePersist= rulePersist EOF
            {
             newCompositeNode(grammarAccess.getPersistRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersist=rulePersist();

            state._fsp--;

             current =iv_rulePersist; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersist"


    // $ANTLR start "rulePersist"
    // InternalPersist.g:71:1: rulePersist returns [EObject current=null] : (otherlv_0= 'model' ( (lv_model_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleRuleStatement ) )* otherlv_4= '}' ) ;
    public final EObject rulePersist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_model_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalPersist.g:77:2: ( (otherlv_0= 'model' ( (lv_model_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleRuleStatement ) )* otherlv_4= '}' ) )
            // InternalPersist.g:78:2: (otherlv_0= 'model' ( (lv_model_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleRuleStatement ) )* otherlv_4= '}' )
            {
            // InternalPersist.g:78:2: (otherlv_0= 'model' ( (lv_model_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleRuleStatement ) )* otherlv_4= '}' )
            // InternalPersist.g:79:3: otherlv_0= 'model' ( (lv_model_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleRuleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersistAccess().getModelKeyword_0());
            		
            // InternalPersist.g:83:3: ( (lv_model_1_0= RULE_STRING ) )
            // InternalPersist.g:84:4: (lv_model_1_0= RULE_STRING )
            {
            // InternalPersist.g:84:4: (lv_model_1_0= RULE_STRING )
            // InternalPersist.g:85:5: lv_model_1_0= RULE_STRING
            {
            lv_model_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_model_1_0, grammarAccess.getPersistAccess().getModelSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersistRule());
            					}
            					setWithLastConsumed(
            						current,
            						"model",
            						lv_model_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPersistAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPersist.g:105:3: ( (lv_statements_3_0= ruleRuleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPersist.g:106:4: (lv_statements_3_0= ruleRuleStatement )
            	    {
            	    // InternalPersist.g:106:4: (lv_statements_3_0= ruleRuleStatement )
            	    // InternalPersist.g:107:5: lv_statements_3_0= ruleRuleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getPersistAccess().getStatementsRuleStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_statements_3_0=ruleRuleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPersistRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"ca.jahed.papyrusrt.persistence.dsl.Persist.RuleStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPersistAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersist"


    // $ANTLR start "entryRuleRuleStatement"
    // InternalPersist.g:132:1: entryRuleRuleStatement returns [EObject current=null] : iv_ruleRuleStatement= ruleRuleStatement EOF ;
    public final EObject entryRuleRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleStatement = null;


        try {
            // InternalPersist.g:132:54: (iv_ruleRuleStatement= ruleRuleStatement EOF )
            // InternalPersist.g:133:2: iv_ruleRuleStatement= ruleRuleStatement EOF
            {
             newCompositeNode(grammarAccess.getRuleStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleStatement=ruleRuleStatement();

            state._fsp--;

             current =iv_ruleRuleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleStatement"


    // $ANTLR start "ruleRuleStatement"
    // InternalPersist.g:139:1: ruleRuleStatement returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleForEachStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleRuleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalPersist.g:145:2: ( (otherlv_0= 'rule' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleForEachStatement ) )* otherlv_4= '}' ) )
            // InternalPersist.g:146:2: (otherlv_0= 'rule' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleForEachStatement ) )* otherlv_4= '}' )
            {
            // InternalPersist.g:146:2: (otherlv_0= 'rule' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleForEachStatement ) )* otherlv_4= '}' )
            // InternalPersist.g:147:3: otherlv_0= 'rule' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleForEachStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleStatementAccess().getRuleKeyword_0());
            		
            // InternalPersist.g:151:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalPersist.g:152:4: (lv_id_1_0= RULE_ID )
            {
            // InternalPersist.g:152:4: (lv_id_1_0= RULE_ID )
            // InternalPersist.g:153:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_id_1_0, grammarAccess.getRuleStatementAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPersist.g:173:3: ( (lv_rules_3_0= ruleForEachStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPersist.g:174:4: (lv_rules_3_0= ruleForEachStatement )
            	    {
            	    // InternalPersist.g:174:4: (lv_rules_3_0= ruleForEachStatement )
            	    // InternalPersist.g:175:5: lv_rules_3_0= ruleForEachStatement
            	    {

            	    					newCompositeNode(grammarAccess.getRuleStatementAccess().getRulesForEachStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_rules_3_0=ruleForEachStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_3_0,
            	    						"ca.jahed.papyrusrt.persistence.dsl.Persist.ForEachStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleStatementAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleStatement"


    // $ANTLR start "entryRuleForEachStatement"
    // InternalPersist.g:200:1: entryRuleForEachStatement returns [EObject current=null] : iv_ruleForEachStatement= ruleForEachStatement EOF ;
    public final EObject entryRuleForEachStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachStatement = null;


        try {
            // InternalPersist.g:200:57: (iv_ruleForEachStatement= ruleForEachStatement EOF )
            // InternalPersist.g:201:2: iv_ruleForEachStatement= ruleForEachStatement EOF
            {
             newCompositeNode(grammarAccess.getForEachStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEachStatement=ruleForEachStatement();

            state._fsp--;

             current =iv_ruleForEachStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForEachStatement"


    // $ANTLR start "ruleForEachStatement"
    // InternalPersist.g:207:1: ruleForEachStatement returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_class_1_0= ruleEClassName ) ) otherlv_2= '{' ( ( (lv_contents_3_0= ruleCreateStatement ) ) | ( (lv_calls_4_0= ruleCallStatement ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleForEachStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_class_1_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_calls_4_0 = null;



        	enterRule();

        try {
            // InternalPersist.g:213:2: ( (otherlv_0= 'foreach' ( (lv_class_1_0= ruleEClassName ) ) otherlv_2= '{' ( ( (lv_contents_3_0= ruleCreateStatement ) ) | ( (lv_calls_4_0= ruleCallStatement ) ) )* otherlv_5= '}' ) )
            // InternalPersist.g:214:2: (otherlv_0= 'foreach' ( (lv_class_1_0= ruleEClassName ) ) otherlv_2= '{' ( ( (lv_contents_3_0= ruleCreateStatement ) ) | ( (lv_calls_4_0= ruleCallStatement ) ) )* otherlv_5= '}' )
            {
            // InternalPersist.g:214:2: (otherlv_0= 'foreach' ( (lv_class_1_0= ruleEClassName ) ) otherlv_2= '{' ( ( (lv_contents_3_0= ruleCreateStatement ) ) | ( (lv_calls_4_0= ruleCallStatement ) ) )* otherlv_5= '}' )
            // InternalPersist.g:215:3: otherlv_0= 'foreach' ( (lv_class_1_0= ruleEClassName ) ) otherlv_2= '{' ( ( (lv_contents_3_0= ruleCreateStatement ) ) | ( (lv_calls_4_0= ruleCallStatement ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachStatementAccess().getForeachKeyword_0());
            		
            // InternalPersist.g:219:3: ( (lv_class_1_0= ruleEClassName ) )
            // InternalPersist.g:220:4: (lv_class_1_0= ruleEClassName )
            {
            // InternalPersist.g:220:4: (lv_class_1_0= ruleEClassName )
            // InternalPersist.g:221:5: lv_class_1_0= ruleEClassName
            {

            					newCompositeNode(grammarAccess.getForEachStatementAccess().getClassEClassNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_class_1_0=ruleEClassName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForEachStatementRule());
            					}
            					set(
            						current,
            						"class",
            						lv_class_1_0,
            						"ca.jahed.papyrusrt.persistence.dsl.Persist.EClassName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getForEachStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPersist.g:242:3: ( ( (lv_contents_3_0= ruleCreateStatement ) ) | ( (lv_calls_4_0= ruleCallStatement ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==18) ) {
                    alt3=1;
                }
                else if ( (LA3_0==25) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPersist.g:243:4: ( (lv_contents_3_0= ruleCreateStatement ) )
            	    {
            	    // InternalPersist.g:243:4: ( (lv_contents_3_0= ruleCreateStatement ) )
            	    // InternalPersist.g:244:5: (lv_contents_3_0= ruleCreateStatement )
            	    {
            	    // InternalPersist.g:244:5: (lv_contents_3_0= ruleCreateStatement )
            	    // InternalPersist.g:245:6: lv_contents_3_0= ruleCreateStatement
            	    {

            	    						newCompositeNode(grammarAccess.getForEachStatementAccess().getContentsCreateStatementParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_contents_3_0=ruleCreateStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getForEachStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contents",
            	    							lv_contents_3_0,
            	    							"ca.jahed.papyrusrt.persistence.dsl.Persist.CreateStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPersist.g:263:4: ( (lv_calls_4_0= ruleCallStatement ) )
            	    {
            	    // InternalPersist.g:263:4: ( (lv_calls_4_0= ruleCallStatement ) )
            	    // InternalPersist.g:264:5: (lv_calls_4_0= ruleCallStatement )
            	    {
            	    // InternalPersist.g:264:5: (lv_calls_4_0= ruleCallStatement )
            	    // InternalPersist.g:265:6: lv_calls_4_0= ruleCallStatement
            	    {

            	    						newCompositeNode(grammarAccess.getForEachStatementAccess().getCallsCallStatementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_calls_4_0=ruleCallStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getForEachStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"calls",
            	    							lv_calls_4_0,
            	    							"ca.jahed.papyrusrt.persistence.dsl.Persist.CallStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getForEachStatementAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForEachStatement"


    // $ANTLR start "entryRuleCreateStatement"
    // InternalPersist.g:291:1: entryRuleCreateStatement returns [EObject current=null] : iv_ruleCreateStatement= ruleCreateStatement EOF ;
    public final EObject entryRuleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateStatement = null;


        try {
            // InternalPersist.g:291:56: (iv_ruleCreateStatement= ruleCreateStatement EOF )
            // InternalPersist.g:292:2: iv_ruleCreateStatement= ruleCreateStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateStatement=ruleCreateStatement();

            state._fsp--;

             current =iv_ruleCreateStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateStatement"


    // $ANTLR start "ruleCreateStatement"
    // InternalPersist.g:298:1: ruleCreateStatement returns [EObject current=null] : (this_CreateFileStatement_0= ruleCreateFileStatement | this_CreateFolderStatement_1= ruleCreateFolderStatement ) ;
    public final EObject ruleCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateFileStatement_0 = null;

        EObject this_CreateFolderStatement_1 = null;



        	enterRule();

        try {
            // InternalPersist.g:304:2: ( (this_CreateFileStatement_0= ruleCreateFileStatement | this_CreateFolderStatement_1= ruleCreateFolderStatement ) )
            // InternalPersist.g:305:2: (this_CreateFileStatement_0= ruleCreateFileStatement | this_CreateFolderStatement_1= ruleCreateFolderStatement )
            {
            // InternalPersist.g:305:2: (this_CreateFileStatement_0= ruleCreateFileStatement | this_CreateFolderStatement_1= ruleCreateFolderStatement )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPersist.g:306:3: this_CreateFileStatement_0= ruleCreateFileStatement
                    {

                    			newCompositeNode(grammarAccess.getCreateStatementAccess().getCreateFileStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateFileStatement_0=ruleCreateFileStatement();

                    state._fsp--;


                    			current = this_CreateFileStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPersist.g:315:3: this_CreateFolderStatement_1= ruleCreateFolderStatement
                    {

                    			newCompositeNode(grammarAccess.getCreateStatementAccess().getCreateFolderStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateFolderStatement_1=ruleCreateFolderStatement();

                    state._fsp--;


                    			current = this_CreateFolderStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateStatement"


    // $ANTLR start "entryRuleCreateFolderStatement"
    // InternalPersist.g:327:1: entryRuleCreateFolderStatement returns [EObject current=null] : iv_ruleCreateFolderStatement= ruleCreateFolderStatement EOF ;
    public final EObject entryRuleCreateFolderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateFolderStatement = null;


        try {
            // InternalPersist.g:327:62: (iv_ruleCreateFolderStatement= ruleCreateFolderStatement EOF )
            // InternalPersist.g:328:2: iv_ruleCreateFolderStatement= ruleCreateFolderStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateFolderStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateFolderStatement=ruleCreateFolderStatement();

            state._fsp--;

             current =iv_ruleCreateFolderStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateFolderStatement"


    // $ANTLR start "ruleCreateFolderStatement"
    // InternalPersist.g:334:1: ruleCreateFolderStatement returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'folder' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '{' ( ( (lv_contents_4_0= ruleCreateStatement ) ) | ( (lv_calls_5_0= ruleCallStatement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleCreateFolderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_name_2_0 = null;

        EObject lv_contents_4_0 = null;

        EObject lv_calls_5_0 = null;



        	enterRule();

        try {
            // InternalPersist.g:340:2: ( (otherlv_0= 'create' otherlv_1= 'folder' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '{' ( ( (lv_contents_4_0= ruleCreateStatement ) ) | ( (lv_calls_5_0= ruleCallStatement ) ) )* otherlv_6= '}' ) )
            // InternalPersist.g:341:2: (otherlv_0= 'create' otherlv_1= 'folder' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '{' ( ( (lv_contents_4_0= ruleCreateStatement ) ) | ( (lv_calls_5_0= ruleCallStatement ) ) )* otherlv_6= '}' )
            {
            // InternalPersist.g:341:2: (otherlv_0= 'create' otherlv_1= 'folder' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '{' ( ( (lv_contents_4_0= ruleCreateStatement ) ) | ( (lv_calls_5_0= ruleCallStatement ) ) )* otherlv_6= '}' )
            // InternalPersist.g:342:3: otherlv_0= 'create' otherlv_1= 'folder' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '{' ( ( (lv_contents_4_0= ruleCreateStatement ) ) | ( (lv_calls_5_0= ruleCallStatement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateFolderStatementAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateFolderStatementAccess().getFolderKeyword_1());
            		
            // InternalPersist.g:350:3: ( (lv_name_2_0= ruleFileName ) )
            // InternalPersist.g:351:4: (lv_name_2_0= ruleFileName )
            {
            // InternalPersist.g:351:4: (lv_name_2_0= ruleFileName )
            // InternalPersist.g:352:5: lv_name_2_0= ruleFileName
            {

            					newCompositeNode(grammarAccess.getCreateFolderStatementAccess().getNameFileNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleFileName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateFolderStatementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ca.jahed.papyrusrt.persistence.dsl.Persist.FileName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateFolderStatementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPersist.g:373:3: ( ( (lv_contents_4_0= ruleCreateStatement ) ) | ( (lv_calls_5_0= ruleCallStatement ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||LA5_0==18) ) {
                    alt5=1;
                }
                else if ( (LA5_0==25) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPersist.g:374:4: ( (lv_contents_4_0= ruleCreateStatement ) )
            	    {
            	    // InternalPersist.g:374:4: ( (lv_contents_4_0= ruleCreateStatement ) )
            	    // InternalPersist.g:375:5: (lv_contents_4_0= ruleCreateStatement )
            	    {
            	    // InternalPersist.g:375:5: (lv_contents_4_0= ruleCreateStatement )
            	    // InternalPersist.g:376:6: lv_contents_4_0= ruleCreateStatement
            	    {

            	    						newCompositeNode(grammarAccess.getCreateFolderStatementAccess().getContentsCreateStatementParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_contents_4_0=ruleCreateStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCreateFolderStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contents",
            	    							lv_contents_4_0,
            	    							"ca.jahed.papyrusrt.persistence.dsl.Persist.CreateStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPersist.g:394:4: ( (lv_calls_5_0= ruleCallStatement ) )
            	    {
            	    // InternalPersist.g:394:4: ( (lv_calls_5_0= ruleCallStatement ) )
            	    // InternalPersist.g:395:5: (lv_calls_5_0= ruleCallStatement )
            	    {
            	    // InternalPersist.g:395:5: (lv_calls_5_0= ruleCallStatement )
            	    // InternalPersist.g:396:6: lv_calls_5_0= ruleCallStatement
            	    {

            	    						newCompositeNode(grammarAccess.getCreateFolderStatementAccess().getCallsCallStatementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_calls_5_0=ruleCallStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCreateFolderStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"calls",
            	    							lv_calls_5_0,
            	    							"ca.jahed.papyrusrt.persistence.dsl.Persist.CallStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCreateFolderStatementAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateFolderStatement"


    // $ANTLR start "entryRuleCreateFileStatement"
    // InternalPersist.g:422:1: entryRuleCreateFileStatement returns [EObject current=null] : iv_ruleCreateFileStatement= ruleCreateFileStatement EOF ;
    public final EObject entryRuleCreateFileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateFileStatement = null;


        try {
            // InternalPersist.g:422:60: (iv_ruleCreateFileStatement= ruleCreateFileStatement EOF )
            // InternalPersist.g:423:2: iv_ruleCreateFileStatement= ruleCreateFileStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateFileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateFileStatement=ruleCreateFileStatement();

            state._fsp--;

             current =iv_ruleCreateFileStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateFileStatement"


    // $ANTLR start "ruleCreateFileStatement"
    // InternalPersist.g:429:1: ruleCreateFileStatement returns [EObject current=null] : (otherlv_0= 'save' otherlv_1= 'in' ( (lv_name_2_0= ruleFileName ) ) ( ( (lv_includedReferencing_3_0= ruleWithStatement ) ) | ( (lv_includedAttributes_4_0= ruleIncludeStatement ) ) )? ) ;
    public final EObject ruleCreateFileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_name_2_0 = null;

        EObject lv_includedReferencing_3_0 = null;

        EObject lv_includedAttributes_4_0 = null;



        	enterRule();

        try {
            // InternalPersist.g:435:2: ( (otherlv_0= 'save' otherlv_1= 'in' ( (lv_name_2_0= ruleFileName ) ) ( ( (lv_includedReferencing_3_0= ruleWithStatement ) ) | ( (lv_includedAttributes_4_0= ruleIncludeStatement ) ) )? ) )
            // InternalPersist.g:436:2: (otherlv_0= 'save' otherlv_1= 'in' ( (lv_name_2_0= ruleFileName ) ) ( ( (lv_includedReferencing_3_0= ruleWithStatement ) ) | ( (lv_includedAttributes_4_0= ruleIncludeStatement ) ) )? )
            {
            // InternalPersist.g:436:2: (otherlv_0= 'save' otherlv_1= 'in' ( (lv_name_2_0= ruleFileName ) ) ( ( (lv_includedReferencing_3_0= ruleWithStatement ) ) | ( (lv_includedAttributes_4_0= ruleIncludeStatement ) ) )? )
            // InternalPersist.g:437:3: otherlv_0= 'save' otherlv_1= 'in' ( (lv_name_2_0= ruleFileName ) ) ( ( (lv_includedReferencing_3_0= ruleWithStatement ) ) | ( (lv_includedAttributes_4_0= ruleIncludeStatement ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateFileStatementAccess().getSaveKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateFileStatementAccess().getInKeyword_1());
            		
            // InternalPersist.g:445:3: ( (lv_name_2_0= ruleFileName ) )
            // InternalPersist.g:446:4: (lv_name_2_0= ruleFileName )
            {
            // InternalPersist.g:446:4: (lv_name_2_0= ruleFileName )
            // InternalPersist.g:447:5: lv_name_2_0= ruleFileName
            {

            					newCompositeNode(grammarAccess.getCreateFileStatementAccess().getNameFileNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleFileName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateFileStatementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ca.jahed.papyrusrt.persistence.dsl.Persist.FileName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPersist.g:464:3: ( ( (lv_includedReferencing_3_0= ruleWithStatement ) ) | ( (lv_includedAttributes_4_0= ruleIncludeStatement ) ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalPersist.g:465:4: ( (lv_includedReferencing_3_0= ruleWithStatement ) )
                    {
                    // InternalPersist.g:465:4: ( (lv_includedReferencing_3_0= ruleWithStatement ) )
                    // InternalPersist.g:466:5: (lv_includedReferencing_3_0= ruleWithStatement )
                    {
                    // InternalPersist.g:466:5: (lv_includedReferencing_3_0= ruleWithStatement )
                    // InternalPersist.g:467:6: lv_includedReferencing_3_0= ruleWithStatement
                    {

                    						newCompositeNode(grammarAccess.getCreateFileStatementAccess().getIncludedReferencingWithStatementParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_includedReferencing_3_0=ruleWithStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateFileStatementRule());
                    						}
                    						set(
                    							current,
                    							"includedReferencing",
                    							lv_includedReferencing_3_0,
                    							"ca.jahed.papyrusrt.persistence.dsl.Persist.WithStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPersist.g:485:4: ( (lv_includedAttributes_4_0= ruleIncludeStatement ) )
                    {
                    // InternalPersist.g:485:4: ( (lv_includedAttributes_4_0= ruleIncludeStatement ) )
                    // InternalPersist.g:486:5: (lv_includedAttributes_4_0= ruleIncludeStatement )
                    {
                    // InternalPersist.g:486:5: (lv_includedAttributes_4_0= ruleIncludeStatement )
                    // InternalPersist.g:487:6: lv_includedAttributes_4_0= ruleIncludeStatement
                    {

                    						newCompositeNode(grammarAccess.getCreateFileStatementAccess().getIncludedAttributesIncludeStatementParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_includedAttributes_4_0=ruleIncludeStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateFileStatementRule());
                    						}
                    						set(
                    							current,
                    							"includedAttributes",
                    							lv_includedAttributes_4_0,
                    							"ca.jahed.papyrusrt.persistence.dsl.Persist.IncludeStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateFileStatement"


    // $ANTLR start "entryRuleFileName"
    // InternalPersist.g:509:1: entryRuleFileName returns [EObject current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final EObject entryRuleFileName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileName = null;


        try {
            // InternalPersist.g:509:49: (iv_ruleFileName= ruleFileName EOF )
            // InternalPersist.g:510:2: iv_ruleFileName= ruleFileName EOF
            {
             newCompositeNode(grammarAccess.getFileNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileName=ruleFileName();

            state._fsp--;

             current =iv_ruleFileName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileName"


    // $ANTLR start "ruleFileName"
    // InternalPersist.g:516:1: ruleFileName returns [EObject current=null] : ( ( ( (lv_prefix_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleEAttributeName ) ) ) (otherlv_2= '+' ( (lv_right_3_0= ruleFileName ) ) )? ) ;
    public final EObject ruleFileName() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        EObject lv_attr_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPersist.g:522:2: ( ( ( ( (lv_prefix_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleEAttributeName ) ) ) (otherlv_2= '+' ( (lv_right_3_0= ruleFileName ) ) )? ) )
            // InternalPersist.g:523:2: ( ( ( (lv_prefix_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleEAttributeName ) ) ) (otherlv_2= '+' ( (lv_right_3_0= ruleFileName ) ) )? )
            {
            // InternalPersist.g:523:2: ( ( ( (lv_prefix_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleEAttributeName ) ) ) (otherlv_2= '+' ( (lv_right_3_0= ruleFileName ) ) )? )
            // InternalPersist.g:524:3: ( ( (lv_prefix_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleEAttributeName ) ) ) (otherlv_2= '+' ( (lv_right_3_0= ruleFileName ) ) )?
            {
            // InternalPersist.g:524:3: ( ( (lv_prefix_0_0= RULE_STRING ) ) | ( (lv_attr_1_0= ruleEAttributeName ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPersist.g:525:4: ( (lv_prefix_0_0= RULE_STRING ) )
                    {
                    // InternalPersist.g:525:4: ( (lv_prefix_0_0= RULE_STRING ) )
                    // InternalPersist.g:526:5: (lv_prefix_0_0= RULE_STRING )
                    {
                    // InternalPersist.g:526:5: (lv_prefix_0_0= RULE_STRING )
                    // InternalPersist.g:527:6: lv_prefix_0_0= RULE_STRING
                    {
                    lv_prefix_0_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_prefix_0_0, grammarAccess.getFileNameAccess().getPrefixSTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFileNameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"prefix",
                    							lv_prefix_0_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPersist.g:544:4: ( (lv_attr_1_0= ruleEAttributeName ) )
                    {
                    // InternalPersist.g:544:4: ( (lv_attr_1_0= ruleEAttributeName ) )
                    // InternalPersist.g:545:5: (lv_attr_1_0= ruleEAttributeName )
                    {
                    // InternalPersist.g:545:5: (lv_attr_1_0= ruleEAttributeName )
                    // InternalPersist.g:546:6: lv_attr_1_0= ruleEAttributeName
                    {

                    						newCompositeNode(grammarAccess.getFileNameAccess().getAttrEAttributeNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_attr_1_0=ruleEAttributeName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileNameRule());
                    						}
                    						set(
                    							current,
                    							"attr",
                    							lv_attr_1_0,
                    							"ca.jahed.papyrusrt.persistence.dsl.Persist.EAttributeName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPersist.g:564:3: (otherlv_2= '+' ( (lv_right_3_0= ruleFileName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPersist.g:565:4: otherlv_2= '+' ( (lv_right_3_0= ruleFileName ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getFileNameAccess().getPlusSignKeyword_1_0());
                    			
                    // InternalPersist.g:569:4: ( (lv_right_3_0= ruleFileName ) )
                    // InternalPersist.g:570:5: (lv_right_3_0= ruleFileName )
                    {
                    // InternalPersist.g:570:5: (lv_right_3_0= ruleFileName )
                    // InternalPersist.g:571:6: lv_right_3_0= ruleFileName
                    {

                    						newCompositeNode(grammarAccess.getFileNameAccess().getRightFileNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleFileName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileNameRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"ca.jahed.papyrusrt.persistence.dsl.Persist.FileName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileName"


    // $ANTLR start "entryRuleIncludeStatement"
    // InternalPersist.g:593:1: entryRuleIncludeStatement returns [EObject current=null] : iv_ruleIncludeStatement= ruleIncludeStatement EOF ;
    public final EObject entryRuleIncludeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeStatement = null;


        try {
            // InternalPersist.g:593:57: (iv_ruleIncludeStatement= ruleIncludeStatement EOF )
            // InternalPersist.g:594:2: iv_ruleIncludeStatement= ruleIncludeStatement EOF
            {
             newCompositeNode(grammarAccess.getIncludeStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncludeStatement=ruleIncludeStatement();

            state._fsp--;

             current =iv_ruleIncludeStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludeStatement"


    // $ANTLR start "ruleIncludeStatement"
    // InternalPersist.g:600:1: ruleIncludeStatement returns [EObject current=null] : (otherlv_0= 'include' ( ( (lv_included_1_0= ruleEReferenceName ) ) (otherlv_2= ',' ( (lv_included_3_0= ruleEReferenceName ) ) )* ) ) ;
    public final EObject ruleIncludeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_included_1_0 = null;

        EObject lv_included_3_0 = null;



        	enterRule();

        try {
            // InternalPersist.g:606:2: ( (otherlv_0= 'include' ( ( (lv_included_1_0= ruleEReferenceName ) ) (otherlv_2= ',' ( (lv_included_3_0= ruleEReferenceName ) ) )* ) ) )
            // InternalPersist.g:607:2: (otherlv_0= 'include' ( ( (lv_included_1_0= ruleEReferenceName ) ) (otherlv_2= ',' ( (lv_included_3_0= ruleEReferenceName ) ) )* ) )
            {
            // InternalPersist.g:607:2: (otherlv_0= 'include' ( ( (lv_included_1_0= ruleEReferenceName ) ) (otherlv_2= ',' ( (lv_included_3_0= ruleEReferenceName ) ) )* ) )
            // InternalPersist.g:608:3: otherlv_0= 'include' ( ( (lv_included_1_0= ruleEReferenceName ) ) (otherlv_2= ',' ( (lv_included_3_0= ruleEReferenceName ) ) )* )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeStatementAccess().getIncludeKeyword_0());
            		
            // InternalPersist.g:612:3: ( ( (lv_included_1_0= ruleEReferenceName ) ) (otherlv_2= ',' ( (lv_included_3_0= ruleEReferenceName ) ) )* )
            // InternalPersist.g:613:4: ( (lv_included_1_0= ruleEReferenceName ) ) (otherlv_2= ',' ( (lv_included_3_0= ruleEReferenceName ) ) )*
            {
            // InternalPersist.g:613:4: ( (lv_included_1_0= ruleEReferenceName ) )
            // InternalPersist.g:614:5: (lv_included_1_0= ruleEReferenceName )
            {
            // InternalPersist.g:614:5: (lv_included_1_0= ruleEReferenceName )
            // InternalPersist.g:615:6: lv_included_1_0= ruleEReferenceName
            {

            						newCompositeNode(grammarAccess.getIncludeStatementAccess().getIncludedEReferenceNameParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_14);
            lv_included_1_0=ruleEReferenceName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getIncludeStatementRule());
            						}
            						add(
            							current,
            							"included",
            							lv_included_1_0,
            							"ca.jahed.papyrusrt.persistence.dsl.Persist.EReferenceName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPersist.g:632:4: (otherlv_2= ',' ( (lv_included_3_0= ruleEReferenceName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPersist.g:633:5: otherlv_2= ',' ( (lv_included_3_0= ruleEReferenceName ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getIncludeStatementAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPersist.g:637:5: ( (lv_included_3_0= ruleEReferenceName ) )
            	    // InternalPersist.g:638:6: (lv_included_3_0= ruleEReferenceName )
            	    {
            	    // InternalPersist.g:638:6: (lv_included_3_0= ruleEReferenceName )
            	    // InternalPersist.g:639:7: lv_included_3_0= ruleEReferenceName
            	    {

            	    							newCompositeNode(grammarAccess.getIncludeStatementAccess().getIncludedEReferenceNameParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_included_3_0=ruleEReferenceName();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getIncludeStatementRule());
            	    							}
            	    							add(
            	    								current,
            	    								"included",
            	    								lv_included_3_0,
            	    								"ca.jahed.papyrusrt.persistence.dsl.Persist.EReferenceName");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludeStatement"


    // $ANTLR start "entryRuleWithStatement"
    // InternalPersist.g:662:1: entryRuleWithStatement returns [EObject current=null] : iv_ruleWithStatement= ruleWithStatement EOF ;
    public final EObject entryRuleWithStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithStatement = null;


        try {
            // InternalPersist.g:662:54: (iv_ruleWithStatement= ruleWithStatement EOF )
            // InternalPersist.g:663:2: iv_ruleWithStatement= ruleWithStatement EOF
            {
             newCompositeNode(grammarAccess.getWithStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWithStatement=ruleWithStatement();

            state._fsp--;

             current =iv_ruleWithStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWithStatement"


    // $ANTLR start "ruleWithStatement"
    // InternalPersist.g:669:1: ruleWithStatement returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'referencing' ( ( (lv_included_2_0= ruleEClassName ) ) (otherlv_3= ',' ( (lv_included_4_0= ruleEClassName ) ) )* ) ) ;
    public final EObject ruleWithStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_included_2_0 = null;

        EObject lv_included_4_0 = null;



        	enterRule();

        try {
            // InternalPersist.g:675:2: ( (otherlv_0= 'with' otherlv_1= 'referencing' ( ( (lv_included_2_0= ruleEClassName ) ) (otherlv_3= ',' ( (lv_included_4_0= ruleEClassName ) ) )* ) ) )
            // InternalPersist.g:676:2: (otherlv_0= 'with' otherlv_1= 'referencing' ( ( (lv_included_2_0= ruleEClassName ) ) (otherlv_3= ',' ( (lv_included_4_0= ruleEClassName ) ) )* ) )
            {
            // InternalPersist.g:676:2: (otherlv_0= 'with' otherlv_1= 'referencing' ( ( (lv_included_2_0= ruleEClassName ) ) (otherlv_3= ',' ( (lv_included_4_0= ruleEClassName ) ) )* ) )
            // InternalPersist.g:677:3: otherlv_0= 'with' otherlv_1= 'referencing' ( ( (lv_included_2_0= ruleEClassName ) ) (otherlv_3= ',' ( (lv_included_4_0= ruleEClassName ) ) )* )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getWithStatementAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getWithStatementAccess().getReferencingKeyword_1());
            		
            // InternalPersist.g:685:3: ( ( (lv_included_2_0= ruleEClassName ) ) (otherlv_3= ',' ( (lv_included_4_0= ruleEClassName ) ) )* )
            // InternalPersist.g:686:4: ( (lv_included_2_0= ruleEClassName ) ) (otherlv_3= ',' ( (lv_included_4_0= ruleEClassName ) ) )*
            {
            // InternalPersist.g:686:4: ( (lv_included_2_0= ruleEClassName ) )
            // InternalPersist.g:687:5: (lv_included_2_0= ruleEClassName )
            {
            // InternalPersist.g:687:5: (lv_included_2_0= ruleEClassName )
            // InternalPersist.g:688:6: lv_included_2_0= ruleEClassName
            {

            						newCompositeNode(grammarAccess.getWithStatementAccess().getIncludedEClassNameParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_14);
            lv_included_2_0=ruleEClassName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getWithStatementRule());
            						}
            						add(
            							current,
            							"included",
            							lv_included_2_0,
            							"ca.jahed.papyrusrt.persistence.dsl.Persist.EClassName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPersist.g:705:4: (otherlv_3= ',' ( (lv_included_4_0= ruleEClassName ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPersist.g:706:5: otherlv_3= ',' ( (lv_included_4_0= ruleEClassName ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_6); 

            	    					newLeafNode(otherlv_3, grammarAccess.getWithStatementAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalPersist.g:710:5: ( (lv_included_4_0= ruleEClassName ) )
            	    // InternalPersist.g:711:6: (lv_included_4_0= ruleEClassName )
            	    {
            	    // InternalPersist.g:711:6: (lv_included_4_0= ruleEClassName )
            	    // InternalPersist.g:712:7: lv_included_4_0= ruleEClassName
            	    {

            	    							newCompositeNode(grammarAccess.getWithStatementAccess().getIncludedEClassNameParserRuleCall_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_included_4_0=ruleEClassName();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getWithStatementRule());
            	    							}
            	    							add(
            	    								current,
            	    								"included",
            	    								lv_included_4_0,
            	    								"ca.jahed.papyrusrt.persistence.dsl.Persist.EClassName");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWithStatement"


    // $ANTLR start "entryRuleCallStatement"
    // InternalPersist.g:735:1: entryRuleCallStatement returns [EObject current=null] : iv_ruleCallStatement= ruleCallStatement EOF ;
    public final EObject entryRuleCallStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallStatement = null;


        try {
            // InternalPersist.g:735:54: (iv_ruleCallStatement= ruleCallStatement EOF )
            // InternalPersist.g:736:2: iv_ruleCallStatement= ruleCallStatement EOF
            {
             newCompositeNode(grammarAccess.getCallStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallStatement=ruleCallStatement();

            state._fsp--;

             current =iv_ruleCallStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallStatement"


    // $ANTLR start "ruleCallStatement"
    // InternalPersist.g:742:1: ruleCallStatement returns [EObject current=null] : (otherlv_0= 'call' ( ( (lv_rules_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_rules_3_0= RULE_ID ) ) )* ) ) ;
    public final EObject ruleCallStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rules_1_0=null;
        Token otherlv_2=null;
        Token lv_rules_3_0=null;


        	enterRule();

        try {
            // InternalPersist.g:748:2: ( (otherlv_0= 'call' ( ( (lv_rules_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_rules_3_0= RULE_ID ) ) )* ) ) )
            // InternalPersist.g:749:2: (otherlv_0= 'call' ( ( (lv_rules_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_rules_3_0= RULE_ID ) ) )* ) )
            {
            // InternalPersist.g:749:2: (otherlv_0= 'call' ( ( (lv_rules_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_rules_3_0= RULE_ID ) ) )* ) )
            // InternalPersist.g:750:3: otherlv_0= 'call' ( ( (lv_rules_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_rules_3_0= RULE_ID ) ) )* )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCallStatementAccess().getCallKeyword_0());
            		
            // InternalPersist.g:754:3: ( ( (lv_rules_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_rules_3_0= RULE_ID ) ) )* )
            // InternalPersist.g:755:4: ( (lv_rules_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_rules_3_0= RULE_ID ) ) )*
            {
            // InternalPersist.g:755:4: ( (lv_rules_1_0= RULE_ID ) )
            // InternalPersist.g:756:5: (lv_rules_1_0= RULE_ID )
            {
            // InternalPersist.g:756:5: (lv_rules_1_0= RULE_ID )
            // InternalPersist.g:757:6: lv_rules_1_0= RULE_ID
            {
            lv_rules_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            						newLeafNode(lv_rules_1_0, grammarAccess.getCallStatementAccess().getRulesIDTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCallStatementRule());
            						}
            						addWithLastConsumed(
            							current,
            							"rules",
            							lv_rules_1_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            // InternalPersist.g:773:4: (otherlv_2= ',' ( (lv_rules_3_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPersist.g:774:5: otherlv_2= ',' ( (lv_rules_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getCallStatementAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalPersist.g:778:5: ( (lv_rules_3_0= RULE_ID ) )
            	    // InternalPersist.g:779:6: (lv_rules_3_0= RULE_ID )
            	    {
            	    // InternalPersist.g:779:6: (lv_rules_3_0= RULE_ID )
            	    // InternalPersist.g:780:7: lv_rules_3_0= RULE_ID
            	    {
            	    lv_rules_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    							newLeafNode(lv_rules_3_0, grammarAccess.getCallStatementAccess().getRulesIDTerminalRuleCall_1_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getCallStatementRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"rules",
            	    								lv_rules_3_0,
            	    								"org.eclipse.xtext.common.Terminals.ID");
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallStatement"


    // $ANTLR start "entryRuleEClassName"
    // InternalPersist.g:802:1: entryRuleEClassName returns [EObject current=null] : iv_ruleEClassName= ruleEClassName EOF ;
    public final EObject entryRuleEClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClassName = null;


        try {
            // InternalPersist.g:802:51: (iv_ruleEClassName= ruleEClassName EOF )
            // InternalPersist.g:803:2: iv_ruleEClassName= ruleEClassName EOF
            {
             newCompositeNode(grammarAccess.getEClassNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEClassName=ruleEClassName();

            state._fsp--;

             current =iv_ruleEClassName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEClassName"


    // $ANTLR start "ruleEClassName"
    // InternalPersist.g:809:1: ruleEClassName returns [EObject current=null] : ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEClassName() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token otherlv_1=null;
        Token lv_fields_2_0=null;


        	enterRule();

        try {
            // InternalPersist.g:815:2: ( ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* ) )
            // InternalPersist.g:816:2: ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* )
            {
            // InternalPersist.g:816:2: ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* )
            // InternalPersist.g:817:3: ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )*
            {
            // InternalPersist.g:817:3: ( (lv_base_0_0= RULE_ID ) )
            // InternalPersist.g:818:4: (lv_base_0_0= RULE_ID )
            {
            // InternalPersist.g:818:4: (lv_base_0_0= RULE_ID )
            // InternalPersist.g:819:5: lv_base_0_0= RULE_ID
            {
            lv_base_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_base_0_0, grammarAccess.getEClassNameAccess().getBaseIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEClassNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"base",
            						lv_base_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPersist.g:835:3: (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPersist.g:836:4: otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEClassNameAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalPersist.g:840:4: ( (lv_fields_2_0= RULE_ID ) )
            	    // InternalPersist.g:841:5: (lv_fields_2_0= RULE_ID )
            	    {
            	    // InternalPersist.g:841:5: (lv_fields_2_0= RULE_ID )
            	    // InternalPersist.g:842:6: lv_fields_2_0= RULE_ID
            	    {
            	    lv_fields_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(lv_fields_2_0, grammarAccess.getEClassNameAccess().getFieldsIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEClassNameRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"fields",
            	    							lv_fields_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEClassName"


    // $ANTLR start "entryRuleEAttributeName"
    // InternalPersist.g:863:1: entryRuleEAttributeName returns [EObject current=null] : iv_ruleEAttributeName= ruleEAttributeName EOF ;
    public final EObject entryRuleEAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeName = null;


        try {
            // InternalPersist.g:863:55: (iv_ruleEAttributeName= ruleEAttributeName EOF )
            // InternalPersist.g:864:2: iv_ruleEAttributeName= ruleEAttributeName EOF
            {
             newCompositeNode(grammarAccess.getEAttributeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttributeName=ruleEAttributeName();

            state._fsp--;

             current =iv_ruleEAttributeName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributeName"


    // $ANTLR start "ruleEAttributeName"
    // InternalPersist.g:870:1: ruleEAttributeName returns [EObject current=null] : ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEAttributeName() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token otherlv_1=null;
        Token lv_fields_2_0=null;


        	enterRule();

        try {
            // InternalPersist.g:876:2: ( ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* ) )
            // InternalPersist.g:877:2: ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* )
            {
            // InternalPersist.g:877:2: ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* )
            // InternalPersist.g:878:3: ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )*
            {
            // InternalPersist.g:878:3: ( (lv_base_0_0= RULE_ID ) )
            // InternalPersist.g:879:4: (lv_base_0_0= RULE_ID )
            {
            // InternalPersist.g:879:4: (lv_base_0_0= RULE_ID )
            // InternalPersist.g:880:5: lv_base_0_0= RULE_ID
            {
            lv_base_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_base_0_0, grammarAccess.getEAttributeNameAccess().getBaseIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEAttributeNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"base",
            						lv_base_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPersist.g:896:3: (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPersist.g:897:4: otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEAttributeNameAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalPersist.g:901:4: ( (lv_fields_2_0= RULE_ID ) )
            	    // InternalPersist.g:902:5: (lv_fields_2_0= RULE_ID )
            	    {
            	    // InternalPersist.g:902:5: (lv_fields_2_0= RULE_ID )
            	    // InternalPersist.g:903:6: lv_fields_2_0= RULE_ID
            	    {
            	    lv_fields_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(lv_fields_2_0, grammarAccess.getEAttributeNameAccess().getFieldsIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEAttributeNameRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"fields",
            	    							lv_fields_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributeName"


    // $ANTLR start "entryRuleEReferenceName"
    // InternalPersist.g:924:1: entryRuleEReferenceName returns [EObject current=null] : iv_ruleEReferenceName= ruleEReferenceName EOF ;
    public final EObject entryRuleEReferenceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReferenceName = null;


        try {
            // InternalPersist.g:924:55: (iv_ruleEReferenceName= ruleEReferenceName EOF )
            // InternalPersist.g:925:2: iv_ruleEReferenceName= ruleEReferenceName EOF
            {
             newCompositeNode(grammarAccess.getEReferenceNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEReferenceName=ruleEReferenceName();

            state._fsp--;

             current =iv_ruleEReferenceName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEReferenceName"


    // $ANTLR start "ruleEReferenceName"
    // InternalPersist.g:931:1: ruleEReferenceName returns [EObject current=null] : ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEReferenceName() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token otherlv_1=null;
        Token lv_fields_2_0=null;


        	enterRule();

        try {
            // InternalPersist.g:937:2: ( ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* ) )
            // InternalPersist.g:938:2: ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* )
            {
            // InternalPersist.g:938:2: ( ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )* )
            // InternalPersist.g:939:3: ( (lv_base_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )*
            {
            // InternalPersist.g:939:3: ( (lv_base_0_0= RULE_ID ) )
            // InternalPersist.g:940:4: (lv_base_0_0= RULE_ID )
            {
            // InternalPersist.g:940:4: (lv_base_0_0= RULE_ID )
            // InternalPersist.g:941:5: lv_base_0_0= RULE_ID
            {
            lv_base_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_base_0_0, grammarAccess.getEReferenceNameAccess().getBaseIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEReferenceNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"base",
            						lv_base_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPersist.g:957:3: (otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPersist.g:958:4: otherlv_1= '.' ( (lv_fields_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEReferenceNameAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalPersist.g:962:4: ( (lv_fields_2_0= RULE_ID ) )
            	    // InternalPersist.g:963:5: (lv_fields_2_0= RULE_ID )
            	    {
            	    // InternalPersist.g:963:5: (lv_fields_2_0= RULE_ID )
            	    // InternalPersist.g:964:6: lv_fields_2_0= RULE_ID
            	    {
            	    lv_fields_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(lv_fields_2_0, grammarAccess.getEReferenceNameAccess().getFieldsIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEReferenceNameRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"fields",
            	    							lv_fields_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEReferenceName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002052000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});

}