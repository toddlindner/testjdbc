docker run --name sqlserver -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=Abcd1234" -e "TZ=America/New_York" -p 1433:1433 --rm mcr.microsoft.com/mssql/server:latest
