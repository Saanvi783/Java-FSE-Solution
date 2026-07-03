/*
QUESTION:
Exercise 2: Error Handling
*/

-- Scenario 1: Handle exceptions during fund transfers between accounts.
-- Scenario 2: Manage errors when updating employee salaries.
-- Scenario 3: Ensure data integrity when adding a new customer.

CREATE OR REPLACE PROCEDURE TransferFunds(p_from_acc NUMBER, p_to_acc NUMBER, p_amount NUMBER) IS
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_acc FOR UPDATE;
    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient Funds');
    END IF;
    UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from_acc;
    UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to_acc;
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/
