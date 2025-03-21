Evaluate Boolean Expression
Medium
Topics
Companies
SQL Schema
Pandas Schema
Table Variables:

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| name          | varchar |
| value         | int     |
+---------------+---------+
In SQL, name is the primary key for this table.
This table contains the stored variables and their values.


Table Expressions:

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| left_operand  | varchar |
| operator      | enum    |
| right_operand | varchar |
+---------------+---------+
In SQL, (left_operand, operator, right_operand) is the primary key for this table.
This table contains a boolean expression that should be evaluated.
operator is an enum that takes one of the values ('<', '>', '=')
The values of left_operand and right_operand are guaranteed to be in the Variables table.


Evaluate the boolean expressions in Expressions table.

Return the result table in any order.

The result format is in the following example.



Example 1:

Input:
Variables table:
+------+-------+
| name | value |
+------+-------+
| x    | 66    |
| y    | 77    |
+------+-------+
Expressions table:
+--------------+----------+---------------+
| left_operand | operator | right_operand |
+--------------+----------+---------------+
| x            | >        | y             |
| x            | <        | y             |
| x            | =        | y             |
| y            | >        | x             |
| y            | <        | x             |
| x            | =        | x             |
+--------------+----------+---------------+
Output:
+--------------+----------+---------------+-------+
| left_operand | operator | right_operand | value |
+--------------+----------+---------------+-------+
| x            | >        | y             | false |
| x            | <        | y             | true  |
| x            | =        | y             | false |
| y            | >        | x             | true  |
| y            | <        | x             | false |
| x            | =        | x             | true  |
+--------------+----------+---------------+-------+
Explanation:
As shown, you need to find the value of each boolean expression in the table using the variables table.

o/P:

# Write your MySQL query statement below
 select T1.left_operand as left_operand,
 T1.operator as operator, T1.right_operand as right_operand,
case
    when T1.operator = '>' and T1.val_1 > T1.val_2 then 'true'
    when T1.operator = '<' and T1.val_1 < T1.val_2 then 'true'
    when T1.operator = '=' and T1.val_1 = T1.val_2 then 'true'
    else 'false'
end  as value
from
 (
select E0.left_operand as left_operand,E0.operator as operator,E0.right_operand as right_operand, V0.value as val_1 , V1.value as val_2
from  Expressions as E0
left join Variables as V0  ON E0.left_operand = V0.name
left join Variables as V1 ON E0.right_operand = V1.name
 ) as T1


