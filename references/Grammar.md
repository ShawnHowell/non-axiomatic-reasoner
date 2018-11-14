# Narsese Grammar to Graph Components (Holochain's Structure)

### Rules

 - `<sentence> ::= <judgement> | <goal> | <question>`
     - Non-Terminals only, no translation necessary.

 - `⟨judgment⟩ ::= [⟨tense⟩]⟨statement⟩. ⟨truth-value⟩`
     - Non-Terminals only, no translation necessary.

 - `⟨goal⟩ ::= ⟨statement⟩! ⟨desire-value⟩`
     - Non-Terminals only, no translation necessary.

 - `⟨question⟩ ::= [⟨tense⟩]⟨statement⟩? | ⟨statement⟩¿`
     - Non-Terminals only, no translation necessary.

 - `<statement>` (below)
 	```
 	⟨statement⟩ ::= (⟨term⟩ ⟨copula⟩ ⟨term⟩) | ⟨term⟩
				| (¬ ⟨statement⟩)
				| (∧ ⟨statement⟩ ⟨statement⟩+ )
				| (∨ ⟨statement⟩ ⟨statement⟩+ )
				| ( , ⟨statement⟩⟨statement⟩+)
				| ( ; ⟨statement⟩⟨statement⟩+)
				| (⇑⟨word⟩ ⟨term⟩∗)
	```
     - After (sentence) disassembly, the statement represents a linked list of entries on the Holochain. Each entry is a word, at first in the English Language.

 - `<copula>` (below)
 	```
 	⟨copula⟩ ::= →|↔|⇒|⇔
			|◦→ | →◦|◦→◦
			|/⇒ |\⇒ ||⇒ |/⇔||⇔
	```
    - Copulae have their own functions each, and deserve their own section - below.

 - `⟨tense⟩ ::= /⇒ | \⇒ | |⇒`

 - `<term>` (below)
 	```
 	⟨term⟩ ::= ⟨word⟩ | ⟨variable⟩ | ⟨statement⟩
			| {⟨term⟩+} | [⟨term⟩+]
			| (∩ ⟨term⟩ ⟨term⟩+)
			| (∪ ⟨term⟩ ⟨term⟩+)
			| (− ⟨term⟩ ⟨term⟩)
			| (⊖ ⟨term⟩ ⟨term⟩)
			| (× ⟨term⟩ ⟨term⟩+)
			| (/ ⟨term⟩ ⟨term⟩∗ ⋄ ⟨term⟩∗)
			| (\ ⟨term⟩ ⟨term⟩∗ ⋄ ⟨term⟩∗)
	```
    - Non-Terminals only, no translation necessary.

 - `⟨variable⟩ ::= ⟨independent-variable⟩ | ⟨dependent-variable⟩ | ⟨query-variable⟩`
     - Intra-grammar term - an inference tool. Does not need to be translated.

 - `<dependent-variable> ::= ‘#′ [⟨word⟩‘(′⟨independent-variable⟩∗‘)′]`
     - Intra-grammar term - an inference tool. Does not need to be translated.
    
 - `<query-variable> ::= ‘?′ [⟨word⟩]`
     - Covered above - <term>.
    
 - `<truth-variable> : a pair of real number in [0,1]×(0,1)`
     - Terminal - stored possibly in a hashmap w/ the key as the hash of the statement in generated Narsese, say `statementHash` and the value being a decodable linear combination of the truth values.
    
 - `<desire-value> : the same as ⟨truth-value⟩`
     - :+1: 

 - `<word> : a string in a given alphabet`
     - Each entry. Connected to and from by semantic links, whose semanticity is dependent upon the functionality of the connector/copulae/relation they are connected using.

### Copulae

#### Primary Copulae

 - `→` inheritance  
     - Standard Holochain Link (base: subject && link: predicate)
    
 - `↔` similarity 
     - Bidirectional Holochain Link

 - `⇒` implication 
     - Link from `base: antecedentStatementHash` to `link: consequentStatementHash` with `tag: implication`
    
 - `⇔` equivalence
     - Bidirectional Link from `base: antecedentStatementHash` to `link: consequentStatementHash` with `tag: equivalence` on both

#### Secondary Copulae

 - `◦→` instance
 - `→◦` property
 - `◦→◦` instance-property
 - `/⇒` predictive implication
 - `\⇒` retrospective implication
 - `|⇒` concurrent implication
 - `/⇔` predictive equivalence
 - `|⇔` concurrent equivalence

#### Tense

 - `/⇒` future
 - `\⇒` past
 - `|⇒` present

#### Term Connector

 - `{}` extensional set
 - `[]` intensional set
 - `∩` extensional intersection
 - `∪` intensional intersection
 - `−` extensional difference
 - `⊖` intensional difference
 - `×` product
 - `/` extensional image
 - `\` intensional image
 - `⋄`image place-holder

#### Statement Connector

 - `¬` negation
 - `∧` conjunction
 - `∨` disjunction
 - `,` sequential conjunction
 - `;` parallel conjunction

#### Term Prefix

 - `#` variable in judgement
 - `?` variable in question
 - `⇑` operator

#### Punctuation

 - `.` judgement
 - `?` question (on truth-value)
 - `!` goal
 - `¿` query (on desire-value)

