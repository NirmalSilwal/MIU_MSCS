# ```Mid term preparation notes ```


**Four states of entity life cycle**
- Transient
- Managed
- Detached
- Removed

**Surrogate Key**
- system generate value with no business meaning that is uniquely used to identify a record in the table
- the key could be composite key (made by combining two or more columns)
- these keys won't be changed based on business requirements as these keys don't carry business logic
- they are unique

Just a few reasons for using surrogate keys:

1. **Stability**: Changing a key because of a business or natural need will negatively affect related tables. Surrogate keys rarely, if ever, need to be changed because there is no meaning tied to the value.

2. **Convention**: Allows you to have a standardized Primary Key column naming convention rather than having to think about how to join tables with various names for their PKs.

3. **Speed**: Depending on the PK value and type, a surrogate key of an integer may be smaller, faster to index and search.

**Natural Key**
- it is a column or set of columns that already exists in the table that is used to uniquely identify a record in the table
- key values have business meaning and can be used as a search key when quering a table
