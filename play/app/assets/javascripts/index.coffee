$ ->
 $.get "/v1/things", (data) ->
    $.each data, (index, thing) ->
        thingText = thing.name + " ---> " + thing.uri + " ---> " + thing.category
        $("#things").append $("<li>").text thingText
