-- Updating confirmed cases for India on a specific date (e.g., correcting the data)
UPDATE covid_cases
SET confirmed_cases = 55000
WHERE country = 'India' AND record_date = '2023-10-02';
