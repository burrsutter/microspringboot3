use run.sh for localhost testing, puts this instance on 8083

To test:

curl -X POST -d "customers=C100" -H "Content-Type: application/x-www-form-urlencoded" http://localhost:8083/api/orders