Feature: Validating Place API's
@AddPlace @Regression
Scenario Outline: Verify if Place is being Successfully added using AddPlaceAPI

		Given Add place Payload with "<name>" "<language>" "<address>"
		When user calls "AddPlaceAPI" with "Post" http request
		Then the API call is success with status code 200
		And "status" in response body is "OK"
		And "scope" in response body is "APP"
		And verify place_Id created maps to "<name>" using "getPlaceAPI"
		
Examples:
		|name				| language  | address						|
		|Vijay			|Telugu			|West Royal Lane		|
#		|Siva				|English		|2729 West Royal Lan|

@DeletePlace @Regression
Scenario: Verify if Delete Place funtionality is working

		Given DeletePlace Payload
		When user calls "deletePlaceAPI" with "POST" http request
		Then the API call got success with status code 200
		And "status" in response body is "OK"