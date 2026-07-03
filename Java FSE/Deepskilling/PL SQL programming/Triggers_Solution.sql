/*
QUESTION:
Exercise 5: Triggers
*/

-- Scenario 1: Update LastModified date on Customer update.
-- Scenario 2: Maintain audit log for transactions.
-- Scenario 3: Enforce business rules on withdrawals.

CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON Customers
FOR EACH ROW
BEGIN
    :NEW.LastModified := SYSDATE;
END;
/
