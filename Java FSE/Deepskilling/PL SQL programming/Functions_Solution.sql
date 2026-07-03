/*
QUESTION:
Exercise 4: Functions
*/

-- Scenario 1: Calculate age of customer.
-- Scenario 2: Compute monthly loan installment.
-- Scenario 3: Check sufficient balance.

CREATE OR REPLACE FUNCTION CalculateAge(p_dob DATE) RETURN NUMBER IS
BEGIN
    RETURN FLOOR(MONTHS_BETWEEN(SYSDATE, p_dob)/12);
END;
/

CREATE OR REPLACE FUNCTION HasSufficientBalance(p_acc_id NUMBER, p_amount NUMBER) RETURN BOOLEAN IS
    v_bal NUMBER;
BEGIN
    SELECT Balance INTO v_bal FROM Accounts WHERE AccountID = p_acc_id;
    RETURN v_bal >= p_amount;
EXCEPTION
    WHEN NO_DATA_FOUND THEN RETURN FALSE;
END;
/
