var app = (function() {
    const send = () => {
        var message = $("#message").val();
        postMethod(message, messages);
    }

    const postMethod = (message,messages) => {
        var promise = $.post({
            url: "/send",
            data: JSON.stringify(message),
            contentType: "application/json"
        });
        promise.then((data) => {
            console.log(data);
            messages(null, JSON.parse(data));
        },(error) => {
            messages(error, null);
        });
    }

    return {
        send: function() {
            send();
        }
    }
})();