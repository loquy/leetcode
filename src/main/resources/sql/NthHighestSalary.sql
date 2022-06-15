-- 表: Employee
--
--
-- +-------------+------+
-- | Column Name | Type |
-- +-------------+------+
-- | id          | int  |
-- | salary      | int  |
-- +-------------+------+
-- Id是该表的主键列。
-- 该表的每一行都包含有关员工工资的信息。
--
--
--
--
--  编写一个SQL查询来报告 Employee 表中第 n 高的工资。如果没有第 n 个最高工资，查询应该报告为 null 。
--
--  查询结果格式如下所示。
--
--
--
--  示例 1:
--
--
-- 输入:
-- Employee table:
-- +----+--------+
-- | id | salary |
-- +----+--------+
-- | 1  | 100    |
-- | 2  | 200    |
-- | 3  | 300    |
-- +----+--------+
-- n = 2
-- 输出:
-- +------------------------+
-- | getNthHighestSalary(2) |
-- +------------------------+
-- | 200                    |
-- +------------------------+
--
--
--  示例 2:
--
--
-- 输入:
-- Employee 表:
-- +----+--------+
-- | id | salary |
-- +----+--------+
-- | 1  | 100    |
-- +----+--------+
-- n = 2
-- 输出:
-- +------------------------+
-- | getNthHighestSalary(2) |
-- +------------------------+
-- | null                   |
-- +------------------------+
--  Related Topics 数据库 👍 601 👎 0

-- There is no code of Java type for this problemx

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE P INT;
    SET P = N-1;
    RETURN (
        select(
                  SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT P,1
              )
    );
END