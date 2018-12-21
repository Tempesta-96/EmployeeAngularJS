var path = require('path');

module.exports = {
    entry: './public/app.js',
    output: {
        path: path.join(__dirname, '/public/dist'),
        filename: 'bundle.js'
    },
    devServer: {
        contentBase: path.join(__dirname, '/public'), // serve your static files from here
        watchContentBase: true, // initiate a page refresh if static content changes
    },
}