/*
QUESTION:
Exercise 7: Packages
*/

-- Scenario 1: Package for customer operations.

CREATE OR REPLACE PACKAGE CustomerManagement AS
    PROCEDURE AddCustomer(p_id NUMBER, p_name VARCHAR2);
    FUNCTION GetBalance(p_id NUMBER) RETURN NUMBER;
END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS
    PROCEDURE AddCustomer(p_id NUMBER, p_name VARCHAR2) IS
    BEGIN
        INSERT INTO Customers (CustomerID, Name, Balance) VALUES (p_id, p_name, 0);
    END AddCustomer;
    
    FUNCTION GetBalance(p_id NUMBER) RETURN NUMBER IS
        v_bal NUMBER;
    BEGIN
        SELECT Balance INTO v_bal FROM Customers WHERE CustomerID = p_id;
        RETURN v_bal;
    END GetBalance;
END CustomerManagement;
/
