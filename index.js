const express = require('express');
const app = express();
const port = 3010;
const path = require('path');
// const pages = require("./src/components");

// app.get('/:name', routes.view)
app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
  });
  
app.use('/', express.static(path.join(__dirname, 'public')));


app.listen(port, () => console.log(`Example app listening on port ${port}!`))