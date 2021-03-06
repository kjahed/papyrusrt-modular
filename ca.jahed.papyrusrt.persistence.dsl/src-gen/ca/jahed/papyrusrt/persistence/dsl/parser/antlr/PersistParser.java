/*
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.parser.antlr;

import ca.jahed.papyrusrt.persistence.dsl.parser.antlr.internal.InternalPersistParser;
import ca.jahed.papyrusrt.persistence.dsl.services.PersistGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PersistParser extends AbstractAntlrParser {

	@Inject
	private PersistGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPersistParser createParser(XtextTokenStream stream) {
		return new InternalPersistParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Persist";
	}

	public PersistGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PersistGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
