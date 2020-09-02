# Relation-algebra-antlr
- Change the relation algebra to sql query using antlr4

### Document
- https://daddyprogrammer.org/post/13525/relation-algebra
- https://daddyprogrammer.org/post/13539/relational-algebra-sql-interpreter-by-antlr

### Support
- Projection
- Selection
- Rename
- InterSection
- Union
- Set Difference
- Catesian Product
- Join
  - natural join
  - inner join
  - left outer join
  - right outer join
  - full outer join
- order by
- group by

### Input / Output Examples

#### Projection
    - Input : π R.a, R.b R 
    - Output : SELECT R.a,R.b FROM R
  
#### Selection
    - Input : σ R.a > 0 AND R.a < 10 OR R.c > 100 R
    - Output : SELECT * FROM R WHERE R.a>0 AND R.a<10 OR R.c>100

#### Projection + Selection
    - Input : π R.a, R.b σ R.a > 0 R
    - Output : SELECT R.a,R.b FROM R WHERE R.a>0
  
#### Rename
    - Input : π Rel.b ρ Rel R
    - Output : SELECT Rel.b FROM R as Rel
  
#### Rename Attribute
    - Input : ρ aa←a, bb←b, c R
    - Output : SELECT R.a as aa,R.b as bb,R.c FROM R
  
#### Intersection
    - Input : π b,d S ∩ π b,d T
    - Output : SELECT b,d FROM S INTERSECT SELECT b,d FROM T

#### Union
    - Input : π b, d S ∪ π b, d T
    - Output : SELECT b,d FROM S UNION SELECT b,d FROM T
  
#### Set Difference
    - Input : π b, d S - π b, d T
    - Output : SELECT b,d FROM S EXCEPT SELECT b,d FROM T
  
#### Catesian Product
    - Input : R ⨯ S ⨯ T
    - Output : SELECT * FROM R,S,T
  
#### Join
    - Input : R ⨝ S
    - Output : SELECT * FROM R NATURAL JOIN S

    - Input : S ⨝ S.b = T.b T
    - Output : SELECT * FROM S INNER JOIN T ON S.b=T.b

    - Input : R ⟕ R.b = T.b T
    - Output : SELECT * FROM R LEFT OUTER JOIN T ON R.b=T.b

    - Input : R ⟖ R.b = T.b T
    - Output : SELECT * FROM R RIGHT OUTER JOIN T ON R.b=T.b

    - Input : R ⟗ R.b = T.b T
    - Output : SELECT * FROM R FULL OUTER JOIN T ON R.b=T.b
  
#### Order by
    - Input : τ R.a asc, R.b desc R
    - Output : SELECT * FROM R ORDER BY R.a asc,R.b desc
    
    - Input : τ R.a desc π R.a, R.b σ R.a > 1 AND R.b = 'd' R
    - Output : SELECT R.a,R.b FROM R WHERE R.a>1 AND R.b='d' ORDER BY R.a desc
  
#### Group by
    - Input : γ R.a, R.b; count(*)→cnt, sum(R.a)→sum σ R.a > 1 R
    - Output : SELECT R.a,R.b,count(*) as cnt,sum(R.a) as sum FROM R WHERE R.a>1 GROUP BY R.a,R.b

    - Input : π R.a, R.b, cnt, sum γ R.a, R.b; count(*)→cnt, sum(R.a)→sum σ R.a > 1 R
    - Output : SELECT R.a,R.b,count(*) as cnt,sum(R.a) as sum FROM R WHERE R.a>1 GROUP BY R.a,R.b

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
