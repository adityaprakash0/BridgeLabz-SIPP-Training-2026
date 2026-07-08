-- Adding a new column to the covid_cases table to store the vaccination percentage
ALTER TABLE covid_cases
ADD COLUMN vaccination_rate DECIMAL(5, 2); 
-- DECIMAL(5,2) allows values like 100.00 or 85.50
