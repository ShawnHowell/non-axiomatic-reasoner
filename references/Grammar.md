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
     - After (sentence) disassembly, the statement represents a linked list of entries on the Holochain. Each entry is a term/word

 - `<copula>` (below)
 	```
 	⟨copula⟩ ::= →|↔|⇒|⇔
			|◦→ | →◦|◦→◦
			|/⇒ |\⇒ ||⇒ |/⇔||⇔
	```

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

 - `⟨variable⟩ ::= ⟨independent-variable⟩ | ⟨dependent-variable⟩ | ⟨query-variable⟩`

 - `<dependent-variable> ::= ‘#′ [⟨word⟩‘(′⟨independent-variable⟩∗‘)′]`
 - `<query-variable> ::= ‘?′ [⟨word⟩]`
 - `<truth-variable> : apairofrealnumberin[0,1]×(0,1)`
 - `<desire-value> : the same as⟨truth-value⟩`
 - `<word> : a string in a given alphabet`

### Copulas

#### Primary Copulas

 - `→` inheritance  
 - `↔` similarity 
 - `⇒` implication 
 - `⇔` equivalence

#### Secondary Copulas

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

