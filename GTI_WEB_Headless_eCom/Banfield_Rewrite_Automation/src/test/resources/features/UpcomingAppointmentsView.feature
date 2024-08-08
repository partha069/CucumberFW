  Feature: 30923-Upcoming Appointments- View

  @30923 @sprint7 @regression
  Scenario: 30923-User wants to view the list of upcoming appointments
  Given user launched the Banfield application
  When User navigated to Home Screen
  Then the user should be redirected to Upcoming appointments screen
  And the user should be displayed with the list of upcoming appointments
  And the user is displayed with the following information on the screen
  #| Pet image/avatar | |Static image|
  #| Day, Date ( Friday, Mar 18, 2021 or Friday, Mar 8, 2021) |
  #| Time (8 a.m. or 12:20 p.m. ) | 
  #| <Pet name> | 
  #| Hospital name | 
  #| Reschedule CTA | 
  #| Cancel CTA | 
  #| Call CTA | 
  #| Make an appointment CTA |
  And the user will tap on Call CTA to open devices default dialer with hospital number pre-filled
  
  
  
  #Covered in Respective Stories
  #And the user taps on Reschedule #28331  
  #And the user taps on Cancel #28332 
  #And the user taps on Make an appointment CTA to get redirected to "Who are we scheduling" #28783 
  
  #NATC
  #And the user will be displayed with either pet photo or pet avatar

