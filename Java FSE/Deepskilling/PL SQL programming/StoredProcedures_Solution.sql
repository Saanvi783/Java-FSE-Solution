/*
QUESTION:
Exercise 3: Stored Procedures
*/

-- Scenario 1: Process monthly interest for savings accounts.
-- Scenario 2: Implement bonus scheme for employees based on performance rating.
-- Scenario 3: Transfer funds between accounts.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts 
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'SAVINGS';
    COMMIT;
END;
/
