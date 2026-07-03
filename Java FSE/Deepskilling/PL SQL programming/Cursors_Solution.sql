/*
QUESTION:
Exercise 6: Cursors
*/

-- Scenario 1: Generate monthly statements.
-- Scenario 2: Apply annual fee.
-- Scenario 3: Update loan interest rate based on policy.

DECLARE
    CURSOR c_stmt IS SELECT CustomerID, Name, Balance FROM Customers;
BEGIN
    FOR r IN c_stmt LOOP
        DBMS_OUTPUT.PUT_LINE('Statement for ' || r.Name || ': Current Balance = ' || r.Balance);
    END LOOP;
END;
/
