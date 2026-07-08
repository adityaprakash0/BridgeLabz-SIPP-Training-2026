SELECT 
    record_date, 
    AVG(new_deaths) AS avg_daily_deaths
FROM 
    covid_deaths
GROUP BY 
    record_date
ORDER BY 
    record_date ASC;
