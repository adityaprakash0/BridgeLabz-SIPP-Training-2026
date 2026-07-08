-- First, inserting a dummy incorrect record just for demonstration
INSERT INTO covid_cases (country, record_date, confirmed_cases, recoveries, population)
VALUES ('IN', '2023-10-03', 100, 50, 1400000000);

-- Deleting the incorrect entry where country name is wrongly entered as 'IN'
DELETE FROM covid_cases
WHERE country = 'IN';
