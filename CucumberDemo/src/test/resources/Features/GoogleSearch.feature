Feature: To validate the google search functionality 1 

@HardCodedUserInput 
Scenario: The google search functionality works fine on hitting search button 
# concrete example illustrating how the software should behave
	Given We have already opened the "https://www.google.com" url 
	When I search "Cucumber BDD tutorial" 
	And I navigate to the search result page 
	Then I am successfully able to validate the google search results 
	
	
@ExamplesUserInput 
Scenario Outline: 
	The google search functionality works fine on hitting search button 
	# concrete example illustrating how the software should behave
	Given We have already opened the "<URL>" url 
	When I search "<SearchText>" 
	And I navigate to the search result page 
	Then I am successfully able to validate the google search results 
	
	Examples: 
		|URL|SearchText|
		|https://www.google.com|Cucumber BDD tutorial|
		
@DataTableWithOutHeaderUserInput 
Scenario: The google search functionality works fine on hitting search button 
# concrete example illustrating how the software should behave
	Given We have already opened the url 
	|https://www.google.com|
	|https://www.wikipedia.org|
				
@DataTableWithHeaderUserInput 
Scenario: The google search functionality works fine on hitting search button 
# concrete example illustrating how the software should behave
	Given We have already opened the url and navigated 
	|Url1|Url2|
	|https://www.google.com|https://www.wikipedia.org|
				
