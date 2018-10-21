## Narsese Grammar to Graph Components (Holochain's Structure)

### Rules

 - `<sentence> ::= <judgement> | <goal> | <question>`

 - `⟨judgment⟩ ::= [⟨tense⟩]⟨statement⟩. ⟨truth-value⟩`

 - `⟨goal⟩ ::= ⟨statement⟩! ⟨desire-value⟩`

 - `⟨question⟩ ::= [⟨tense⟩]⟨statement⟩? | ⟨statement⟩¿

 - ```⟨statement⟩ ::= (⟨term⟩ ⟨copula⟩ ⟨term⟩) | ⟨term⟩
		| (¬ ⟨statement⟩)
		| (∧ ⟨statement⟩ ⟨statement⟩+ )
		| (∨ ⟨statement⟩ ⟨statement⟩+ )
		| ( , ⟨statement⟩⟨statement⟩+)
		| ( ; ⟨statement⟩⟨statement⟩+)
		| (⇑⟨word⟩ ⟨term⟩∗)```

 - ```⟨copula⟩ ::= →|↔|⇒|⇔
		|◦→ | →◦|◦→◦
		|/⇒ |\⇒ ||⇒ |/⇔||⇔```

 - `⟨tense⟩ ::= /⇒ | \⇒ | |⇒`

 - ```⟨term⟩ ::= ⟨word⟩ | ⟨variable⟩ | ⟨statement⟩
		| {⟨term⟩+} | [⟨term⟩+]
		| (∩ ⟨term⟩ ⟨term⟩+)
		| (∪ ⟨term⟩ ⟨term⟩+)
		| (− ⟨term⟩ ⟨term⟩)
		| (⊖ ⟨term⟩ ⟨term⟩)
		| (× ⟨term⟩ ⟨term⟩+)
		| (/ ⟨term⟩ ⟨term⟩∗ ⋄ ⟨term⟩∗)
		| (\ ⟨term⟩ ⟨term⟩∗ ⋄ ⟨term⟩∗)```

 - `⟨variable⟩ ::= ⟨independent-variable⟩ | ⟨dependent-variable⟩ | ⟨query-variable⟩`

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
