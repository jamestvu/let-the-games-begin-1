# Let The Games Begin
A better way to create and manage tournament brackets.

# Installation Instruction

####Requirements
- IntelliJ IDEA Ultimate
- MySQL
- Java JDK 13
- Node/NPM
- Yarn
- Git

### Downloading IntelliJ IDEA Ultimate
Visit https://jetbrains.com to purchase the IntelliJ Ultimate. At this moment, I am not sure if you can use the free community version of IntelliJ. IF you are a student, please visit https://www.jetbrains.com/shop/eform/students to get yourself free copies of jetbrains application including the IntelliJ Ultimate IDE.

### Downloading and Installing MySQL MAC Instruction
- Visit https://brew.sh
- copy the line script on the website and paste it into mac terminal and hit enter. this will install brew.
- type "brew update"
- type "brew install mysql"

### Downloading and Installing MySQL PC Instruction
- Visit https://dev.mysql.com/downloads/windows/installer/8.0.html
- Select "Download Windows (x86, 32-bit), MSI Installer 8.0.19 398.9M"
- Select "No thanks, just start my download."
- Once you finished download MySQL Community Server, Open the installer.
- Select the "Developer Default" radio button then click Next.
- Here, it will list a bunch of apps it will install BUT it's dependencies for those apps are missing. Click Execute and the installer will try and download the missing dependencies.
- Once all dependencies are installed for those apps, click Next.
- Here, you will see another list, of all the apps its going to install now, now that it finally has all those missing dependencies installed previously.
- Once completed, click Next.
- Product Configuration, click Next.
- High Availability, radio button should default to "Standalone MySQL Server/Classic MySQL Replication". Click Next.
- Type and Networking, click Next.
- Authentication Method, make sure radio button is selecting "Use Strong Password Encryption for Authentication" and click Next.
- Enter your MySQL Database "root" password. 
- Then under MySQL User Accounts, click Add User and enter your name and password but leave everything to default.
- Click Next.
- Windows Service, Click Next.
- Click Execute.
- Click Finish.
- Product Configuration, Click Next.
- Click Finish.
- Connect To Server, enter the "root" password and click "Check" button. if its correct, you should be able to click Next.
- Click Execute.
- Click Finish.
- Click Next.
- Click Finish.
- Update Catalog, Click Execute.
- Click Next, Click Finish.
- Close the Installer.
- You should see a Welcome to MySQL Workbench as well as MySQL Shell command line.
- You can close both application.

### Installing Java Development Kit JDK
- Mac users, run "brew install java"
- PC users, follow this instruction https://java.tutorials24x7.com/blog/how-to-install-openjdk-13-on-windows

### Installing Node/NPM with NVM or from website
- There are a few ways to achieve this but I highly recommend using Node Version Manager (NVM). Reason for this is because sometimes application will work with a particular Node version and it might not for another due to bugs and etc. with NVM, you can download that exact node version and it also allows easy update of node/npm.
- for macs, run "curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.35.2/install.sh | bash" without the quotes.
- for pc, follow this instruction https://github.com/coreybutler/nvm-windows
- Or you can just go to https://nodejs.org and download the latest node/npm.

### Installing Yarn
- for macs, after installing brew from instructions above, run "brew install yarn"
- for PCs, follow instruction here https://yarnpkg.com/getting-started

### Install Git
- Visit this website and download the installer https://git-scm.com/download/win

### Setting up IntelliJ IDEA Ultimate with Project and Database
- Open IntelliJ IDEA Ultimate.
- Enter credentials or use 30 day trial.
- Select "Get from Version Control".
- Select Github on the left side navigation.
- Enter Github repo URL.
- Remember the Default location that it will clone the repo to.
- Click "Clone" button.
- It will ask if you want to import the project, select no.
- The project will be cloned to a folder. now select "Open" and find that repo and click ok.
- You should see the project tree on the left side. It should contain a client, server, and .idea folder.
- Lets first set up our MySQL Database before we run Springboot.
- On the Right side, you should see Database collapse along the edge of the app. Click on it and it should expand.
- Click the + then select "Data Source" and Select MySQL.
- There should be a warming that you need to install a MySQL driver, click on it to install the driver.
- for User, enter "root".
- for Password, enter your password you created during the mySQL installation.
- click "Test".
- if it works, click Apply then click ok.
- you should see some new folders in the database section. lets add our first Schema (database).
- Click the + and select Schema.
- give it the name "letthegamesbegin" and click the Execute button.
- the database is ready and with this database, you can now run Springboot.
- Lets make sure some IntelliJ settings are in place. 
- Go to File and select Project Structures...
- Under Project, make sure the Project SDK is selected to Java 13.
- Next, lets set up Gradle to use the proper JDK