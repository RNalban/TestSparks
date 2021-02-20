from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.common.exceptions import NoSuchElementException
from selenium.webdriver.support.ui import Select
import time
driver = webdriver.Chrome("C:\\Users\\rn210\\AppData\\Local\\Programs\\Python\\Python39\\Lib\\site-packages\\chromedriver.exe")

driver.get("https://www.thesparksfoundationsingapore.org")

#CASE 1:ABOUT US PAGE:news
try:
    driver.find_element_by_link_text('About Us').click()
    time.sleep(3)
    driver.find_element_by_link_text('News').click()
    time.sleep(3)
    print('News of About us Page visited Successfully!\n')
except NoSuchElementException:
    print("About us not exist.\n")
    time.sleep(3)

#CASE 2:HOME BUTTON
try:
    driver.find_element_by_partial_link_text("The Sparks Foundation").click()
    print("Home link is Working!\n")
except NoSuchElementException:
    print("Home Link Does not exist!\n")

#CASE 3:Policies and Code PAGE:Code of Ethics And Conduct
try:
    driver.find_element_by_link_text('Policies and Code').click()
    time.sleep(3)
    driver.find_element_by_link_text('Code of Ethics and Conduct').click()
    time.sleep(3)
    print('Policies and code Page visited Successfully!\n')
except NoSuchElementException:
    print("Policies and Code not exist.\n")
    time.sleep(3)
#CASE 4:Programs:Workshops
try:
    driver.find_element_by_link_text('Programs').click()
    time.sleep(3)
    driver.find_element_by_link_text('Workshops').click()
    time.sleep(3)
    print('Programs Page visited Successfully!\n')
except NoSuchElementException:
    print("Programs not exist.\n")
    time.sleep(3)

#CASE 5:LINK:news
try:
    driver.find_element_by_link_text('LINKS').click()
    time.sleep(3)
    driver.find_element_by_link_text('Salient Features').click()
    time.sleep(3)
    print('Salient Features of LINKS Page visited Successfully!\n')
except NoSuchElementException:
    print("LINKS not exist.\n")
    time.sleep(3)
    
#CASE 6:Join Us PAGE:Brand Ambassador
try:
    driver.find_element_by_link_text('Join Us').click()
    time.sleep(3)
    driver.find_element_by_link_text('Brand Ambassador').click()
    time.sleep(3)
    print('Brand Ambassador of Join Us Page visited Successfully!\n')
except NoSuchElementException:
    print("Join Us not exist.\n")
    time.sleep(3)
#CASE 7:LOGO
try:
    driver.find_element_by_xpath('//*[@id="home"]/div/div[1]/h1/a/*').click()
    print('Logo Exist!\n')
    time.sleep(3)
except NoSuchElementException:
    print('No logo found!\n')

#CASE 8:Know More
driver.find_element_by_partial_link_text("The Sparks Foundation").click()
try:
    Know=driver.find_element_by_xpath("/html/body/div[2]/div/div[2]/a")
    Know.click()
    time.sleep(3)
    print('Know More visited Successfully!\n')
except NoSuchElementException:
    print("Know more not exist.\n")
    time.sleep(3)

#CASE 9:EXPERT MENTOR
    
try:
    driver.find_element_by_link_text('Expert Mentor').click()
    print('Expert Mentor Exist!\n')
    time.sleep(3)
except NoSuchElementException:
    print('Expert Mentor does not exist!\n')
#CASE 10:SCROLL TO TOP

try:
    driver.find_element_by_id("toTopHover").click()
    print('Scrolled to Top!\n')
    time.sleep(3)
except NoSuchElementException:
    print('Scroll Dont Work!\n')