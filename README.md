# Relation-algebra-antlr
- Change the relation algebra to sql query using antlr4

### Support
- Projection
- Selection
- Rename
- InterSection
- Union
- Set Difference
- Join
  - natural join
  - inner join
  - left outer join
  - right outer join
- order by
- group by

### Create parser
- grammar source
  - src/main/antlr/Ra.g4
- create parser
  - ./gradlew generateGrammarSource
- generated path
  - src/main/java/org/antlr/study/generated

### Interpreter Test
- Interpreter
  - src/main/java/org/antlr/study/algebra/RaInterpreter
- Test code
  - src/test/java/org/antlr/study/algebra
- Test
  - ./gradlew test
