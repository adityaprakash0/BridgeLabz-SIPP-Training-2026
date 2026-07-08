SELECT 
    cd.country_name, 
    cd.total_deaths, 
    cv.vaccination_status,
    cv.total_vaccinated
FROM 
    covid_deaths cd
LEFT JOIN 
    covid_vaccines cv ON cd.country_id = cv.country_id;
