-- Create covid_cases table
CREATE TABLE covid_cases (
    country VARCHAR(100),
    record_date DATE,
    confirmed_cases INT,
    recoveries INT,
    population BIGINT,
    PRIMARY KEY (country, record_date)
);

-- Create covid_deaths table
CREATE TABLE covid_deaths (
    country VARCHAR(100),
    record_date DATE,
    total_deaths INT,
    PRIMARY KEY (country, record_date)
);

-- Create covid_vaccines table
CREATE TABLE covid_vaccines (
    country VARCHAR(100),
    record_date DATE,
    vaccines_administered BIGINT,
    PRIMARY KEY (country, record_date)
);
