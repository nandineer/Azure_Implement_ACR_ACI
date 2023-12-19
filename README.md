# Azure_Implement_ACR_ACI

Create a Container Registry


1.	Log in to the Azure portal and select “Create a resource”.
2.	Search for “Container Registry” and select it.
3.	Choose a subscription, resource group, and registry name.
4.	Select the “Standard” SKU and choose a location.
5.	Click on “Review + create” and then “Create”.
6.	Click on Access Key and Connect to the server
7.	Push the docker image to the server
8.	Click on the repository and check whether the pushed image is found.

Create a Container Instance

9.	In the Azure portal, under Azure services at the top of the window, click Container instances.
10.	On the Create container instance page, configure the following settings (leaving anything not specified at the default settings):

i)	Enter resource group
ii)	Enter the container name
iii)	Region
iv)	Click on ACR and select the image name
v)	Click on review and create 
vi)	Once the validation is successful.
11.	On the container instance overview page, copy the container instance address and enter in browser.
12.	The application web page should be displayed.

![image](https://github.com/nandineer/Azure_Implement_ACR_ACI/assets/22636122/ce96fe62-497c-43ef-8f9e-8262e1c8b3fa)
