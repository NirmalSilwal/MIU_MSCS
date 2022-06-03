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

**Sequences in database**
- Generating unique integers is a very common task in database systems. Many applications require each row in a given table to hold a unique value. One way to tackle this problem is to use sequences.
- A sequence is a database object which allows users to generate unique integer values.
> - The primary key is a column in a table.
> - The primary key needs a unique value, which needs to come from somewhere.
> - The sequence is a feature by some database products which just creates unique values. It just increments a value and returns it. The special thing about it is: there is no transaction isolation, so several transactions can not get the same value, the incrementation is also not rolled back. Without a database sequence it is very hard to generate unique incrementing numbers.

