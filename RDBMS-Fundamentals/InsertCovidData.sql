-- Inserting multiple records for India, USA, and UK into covid_cases
INSERT INTO covid_cases (country, record_date, confirmed_cases, recoveries, population)
VALUES 
    ('India', '2023-10-01', 50000, 45000, 1400000000),
    ('India', '2023-10-02', 52000, 47000, 1400000000),
    
    ('USA', '2023-10-01', 30000, 28000, 331000000),
    ('USA', '2023-10-02', 31500, 29000, 331000000),
    
    ('UK', '2023-10-01', 15000, 14000, 67000000),
    ('UK', '2023-10-02', 16000, 14500, 67000000);
