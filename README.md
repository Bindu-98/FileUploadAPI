# FileUpload Microservice

This is a Microservice to Handle all the file related functions.

## HTTP Request to Upload A File

    PUT /api/v1/archive/document-classes
    Content-Type: application/json
    Authorization: Bearer <bearer token>
    Content-Length: <length of the request body>
    
    {
    "tenant": "<id of the tenant>",
    "fields": [
    {
    "name": "<Name of the field>",
    "dataype": "<Datatype>",
    "required": <true / false>,
    "length": <Field-length>,
    "mask": "<Mask-of-the-field>"
    },
    { ... }
    ],
    "retention": <retention-in-months>,
    "display-mode": "normal"
    }
