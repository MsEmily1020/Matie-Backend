INSERT INTO image (url, type) VALUES ('http://localhost:8080/character/1.svg', 2);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/character/2.svg', 2);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/character/3.svg', 2);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/character/4.svg', 2);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/1.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/2.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/3.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/4.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/5.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/6.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/7.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/8.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/9.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/10.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/11.svg', 3);
INSERT INTO image (url, type) VALUES ('http://localhost:8080/products/12.svg', 3);

INSERT INTO users (name, user_id, email, pw, created_date) VALUES ('김혜승', 'hyeseung', 's2224@e-mirim.hs.kr', '$2a$10$tEM8I25AuRIaY61FrEEBDe6ljr5F17UEzl50pjZoPe40m0gZrifA6', '2023-10-20 10:11:20');
INSERT INTO users (name, user_id, email, pw, created_date) VALUES ('Leemark', 'markkk', 'asdf01@gmail.com ', '$2a$12$neEepi56DVXh54h7/D2cmuWnxL4nZzQA8yTRU3Dfm4vOK4hcRDRLa', '2024-07-10 10:11:10');
INSERT INTO point (variation, balance, user_id) VALUES (0, 0, 1);

INSERT INTO category (name) VALUES ('Grocery');
INSERT INTO category (name) VALUES ('Food');

insert into product (name, description, point, category_id) values ('Coriander - Ground', 'Displaced fracture of lateral condyle of right tibia, initial encounter for closed fracture', 71, 1);
insert into product (name, description, point, category_id) values ('Heavy Duty Dust Pan', 'Displaced fracture of distal pole of navicular [scaphoid] bone of unspecified wrist, subsequent encounter for fracture with nonunion', 26, 1);
insert into product (name, description, point, category_id) values ('Cheese - Brie Roitelet', 'Reiter''s disease, unspecified site', 24, 2);
insert into product (name, description, point, category_id) values ('Pepper - Cubanelle', 'Other human herpesvirus encephalitis', 37, 2);
insert into product (name, description, point, category_id) values ('Soup - French Can Pea', 'Disorders of retroperitoneum', 57, 1);
insert into product (name, description, point, category_id) values ('Foam Espresso Cup Plain White', 'Mild intermittent asthma with (acute) exacerbation', 32, 2);
insert into product (name, description, point, category_id) values ('Cheese - Gouda Smoked', 'Other subluxation and dislocation of ulnohumeral joint', 53, 2);
insert into product (name, description, point, category_id) values ('Beef Dry Aged Tenderloin Aaa', 'Laceration with foreign body of left wrist, subsequent encounter', 39, 2);
insert into product (name, description, point, category_id) values ('Wine - Penfolds Koonuga Hill', 'Legal intervention involving injury by tear gas, law enforcement official injured, subsequent encounter', 65, 1);
insert into product (name, description, point, category_id) values ('Juice - Propel Sport', 'Injury of splenic vein', 57, 1);
insert into product (name, description, point, category_id) values ('Flavouring - Raspberry', 'Displaced fracture of olecranon process without intraarticular extension of left ulna, sequela', 73, 1);
insert into product (name, description, point, category_id) values ('Edible Flower - Mixed', 'Strain of unspecified muscles, fascia and tendons at thigh level, unspecified thigh, subsequent encounter', 47, 1);
insert into product (name, description, point, category_id) values ('Wasabi Powder', 'Laceration without foreign body of right front wall of thorax without penetration into thoracic cavity', 83, 1);
insert into product (name, description, point, category_id) values ('Pasta - Ravioli', 'Nondisplaced comminuted fracture of right patella', 71, 1);
insert into product (name, description, point, category_id) values ('Coffee - Ristretto Coffee Capsule', 'Other personality and behavioral disorders due to known physiological condition', 43, 1);
insert into product (name, description, point, category_id) values ('Coconut - Shredded, Unsweet', 'Laceration without foreign body of right great toe with damage to nail, subsequent encounter', 88, 2);
insert into product (name, description, point, category_id) values ('Cheese - Pied De Vents', 'Congenital malformations of ear causing impairment of hearing', 76, 1);
insert into product (name, description, point, category_id) values ('Pie Filling - Cherry', 'Acute hepatitis C', 8, 1);
insert into product (name, description, point, category_id) values ('Wine - Placido Pinot Grigo', 'Car passenger injured in noncollision transport accident in traffic accident', 60, 1);
insert into product (name, description, point, category_id) values ('Vodka - Hot, Lnferno', 'Contusion of left hip, initial encounter', 44, 1);
insert into product (name, description, point, category_id) values ('Tart - Lemon', 'Poisoning by other agents primarily affecting gastrointestinal system, accidental (unintentional), sequela', 64, 1);
insert into product (name, description, point, category_id) values ('Chick Peas - Dried', 'Acute embolism and thrombosis of subclavian vein', 72, 2);
insert into product (name, description, point, category_id) values ('Walkers Special Old Whiskey', 'Torus fracture of lower end of left tibia, subsequent encounter for fracture with nonunion', 7, 1);
insert into product (name, description, point, category_id) values ('Tea - Vanilla Chai', 'Congenital aphakia', 28, 1);
insert into product (name, description, point, category_id) values ('Sugar - White Packet', 'Corrosion of unspecified degree of unspecified elbow', 7, 2);
insert into product (name, description, point, category_id) values ('Island Oasis - Pina Colada', 'Acquired clubfoot, right foot', 16, 1);
insert into product (name, description, point, category_id) values ('Wine - Placido Pinot Grigo', 'Allergy, unspecified, sequela', 66, 2);
insert into product (name, description, point, category_id) values ('Trout - Rainbow, Fresh', 'Sprain of deltoid ligament of left ankle, initial encounter', 22, 2);
insert into product (name, description, point, category_id) values ('Juice - Cranberry, 341 Ml', 'Crushed between unspecified watercraft and other watercraft or other object due to collision, sequela', 26, 1);
insert into product (name, description, point, category_id) values ('Remy Red Berry Infusion', 'Laceration of lip and oral cavity without foreign body', 94, 2);
insert into product (name, description, point, category_id) values ('Icecream - Dstk Cml And Fdg', 'Salmonella pneumonia', 46, 2);
insert into product (name, description, point, category_id) values ('Gingerale - Schweppes, 355 Ml', 'Hyphema', 20, 1);
insert into product (name, description, point, category_id) values ('Sour Puss - Tangerine', 'Laceration of intrinsic muscle, fascia and tendon of right little finger at wrist and hand level', 33, 1);
insert into product (name, description, point, category_id) values ('Wine - Prosecco Valdobiaddene', 'Plasma cell leukemia', 86, 1);
insert into product (name, description, point, category_id) values ('Syrup - Kahlua Chocolate', 'Rheumatoid vasculitis with rheumatoid arthritis of left elbow', 2, 2);
insert into product (name, description, point, category_id) values ('Bread - Raisin', 'Displaced fracture of medial phalanx of left ring finger, initial encounter for open fracture', 57, 2);
insert into product (name, description, point, category_id) values ('Yogurt - Assorted Pack', 'Contact with hot fluids, undetermined intent, subsequent encounter', 15, 2);
insert into product (name, description, point, category_id) values ('Wine - White, Antinore Orvieto', 'Nondisplaced fracture of greater trochanter of right femur, subsequent encounter for open fracture type I or II with malunion', 52, 1);
insert into product (name, description, point, category_id) values ('Honey - Liquid', 'Nondisplaced fracture of acromial process, unspecified shoulder, subsequent encounter for fracture with routine healing', 70, 2);
insert into product (name, description, point, category_id) values ('Cookie Dough - Double', 'Age-related osteoporosis with current pathological fracture, vertebra(e), subsequent encounter for fracture with nonunion', 71, 1);
insert into product (name, description, point, category_id) values ('Nut - Macadamia', 'Accidental twist by another person, initial encounter', 77, 2);
insert into product (name, description, point, category_id) values ('Wine - Carmenere Casillero Del', 'Toxic effect of soaps, accidental (unintentional), subsequent encounter', 39, 2);
insert into product (name, description, point, category_id) values ('Momiji Oroshi Chili Sauce', 'Other fracture of upper end of unspecified radius', 37, 1);
insert into product (name, description, point, category_id) values ('Pail - 4l White, With Handle', 'Other specified postprocedural states', 62, 1);
insert into product (name, description, point, category_id) values ('Huck White Towels', 'Salter-Harris Type I physeal fracture of lower end of humerus, right arm, subsequent encounter for fracture with malunion', 61, 1);
insert into product (name, description, point, category_id) values ('Wine - Maipo Valle Cabernet', 'Low risk human papillomavirus (HPV) DNA test positive from female genital organs', 98, 1);
insert into product (name, description, point, category_id) values ('Squid - Breaded', 'Dislocation of jaw', 29, 1);
insert into product (name, description, point, category_id) values ('Turkey - Breast, Boneless Sk On', 'Herpesviral infection of urogenital system, unspecified', 9, 1);
insert into product (name, description, point, category_id) values ('Russian Prince', 'Postviral fatigue syndrome', 79, 2);
insert into product (name, description, point, category_id) values ('Potatoes - Mini White 3 Oz', 'Puncture wound with foreign body of unspecified lesser toe(s) with damage to nail', 88, 2);
insert into product (name, description, point, category_id) values ('Energy Drink', 'Superficial foreign body, unspecified knee, initial encounter', 25, 1);
insert into product (name, description, point, category_id) values ('Icecream - Dstk Strw Chseck', 'Open wound of wrist', 82, 2);
insert into product (name, description, point, category_id) values ('Mushroom - White Button', 'Nondisplaced comminuted fracture of shaft of right tibia, subsequent encounter for closed fracture with delayed healing', 69, 2);
insert into product (name, description, point, category_id) values ('Pepper - Orange', 'Pre-eclampsia', 22, 1);
insert into product (name, description, point, category_id) values ('Wine La Vielle Ferme Cote Du', 'Displaced fracture of proximal phalanx of right thumb', 55, 1);
insert into product (name, description, point, category_id) values ('Salami - Genova', 'Unspecified fracture of lower end of left femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with delayed healing', 42, 1);
insert into product (name, description, point, category_id) values ('Pastry - Raisin Muffin - Mini', 'Poisoning by caffeine, intentional self-harm, initial encounter', 99, 1);
insert into product (name, description, point, category_id) values ('Bagel - 12 Grain Preslice', 'Wedge compression fracture of fourth thoracic vertebra, subsequent encounter for fracture with delayed healing', 46, 2);
insert into product (name, description, point, category_id) values ('Chips Potato All Dressed - 43g', 'Other spontaneous pneumothorax', 92, 1);
insert into product (name, description, point, category_id) values ('Crab Meat Claw Pasteurise', '17 weeks gestation of pregnancy', 23, 1);
insert into product (name, description, point, category_id) values ('The Pop Shoppe - Root Beer', 'Other chronic osteomyelitis, right  humerus', 28, 1);
insert into product (name, description, point, category_id) values ('Soup Campbells Beef With Veg', 'Fracture of one rib, left side', 23, 1);
insert into product (name, description, point, category_id) values ('Nantucket - Kiwi Berry Cktl.', 'Toxic effect of other halogen derivatives of aromatic hydrocarbons, intentional self-harm, sequela', 49, 2);
insert into product (name, description, point, category_id) values ('Juice - Ocean Spray Kiwi', 'Other specified conduction disorders', 63, 2);
insert into product (name, description, point, category_id) values ('Curry Powder Madras', 'Contusion, laceration, and hemorrhage of cerebellum with loss of consciousness greater than 24 hours without return to pre-existing conscious level with patient surviving, sequela', 27, 2);
insert into product (name, description, point, category_id) values ('Puree - Mocha', 'Corneal disorder due to contact lens, bilateral', 34, 1);
insert into product (name, description, point, category_id) values ('Whmis - Spray Bottle Trigger', 'Nondisplaced segmental fracture of shaft of left fibula, subsequent encounter for open fracture type I or II with delayed healing', 78, 2);
insert into product (name, description, point, category_id) values ('Carbonated Water - Orange', 'Other sprain of sternum, sequela', 100, 1);
insert into product (name, description, point, category_id) values ('Flour - So Mix Cake White', 'Contusion of descending [left] colon, initial encounter', 69, 2);
insert into product (name, description, point, category_id) values ('Puree - Raspberry', 'Other dislocation of right patella, sequela', 78, 2);
insert into product (name, description, point, category_id) values ('Broom - Angled', 'Unspecified physeal fracture of left metatarsal, subsequent encounter for fracture with malunion', 26, 1);
insert into product (name, description, point, category_id) values ('Thyme - Dried', 'Congenital complete absence of upper limb', 74, 1);
insert into product (name, description, point, category_id) values ('Pastry - Baked Cinnamon Stick', 'Unspecified place in other specified residential institution as the place of occurrence of the external cause', 43, 1);
insert into product (name, description, point, category_id) values ('Isomalt', 'Sprain of interphalangeal joint of other finger, sequela', 59, 1);
insert into product (name, description, point, category_id) values ('Doilies - 7, Paper', 'Dislocation of C2/C3 cervical vertebrae, sequela', 40, 1);
insert into product (name, description, point, category_id) values ('Wine - Riesling Alsace Ac 2001', 'Limitation of activities due to disability', 42, 1);
insert into product (name, description, point, category_id) values ('Ecolab - Lime - A - Way 4/4 L', 'Displaced fracture of olecranon process with intraarticular extension of left ulna, subsequent encounter for open fracture type I or II with routine healing', 94, 1);
insert into product (name, description, point, category_id) values ('Oil - Shortening - All - Purpose', 'Other incomplete lesion at C2 level of cervical spinal cord, initial encounter', 8, 2);
insert into product (name, description, point, category_id) values ('Bread - Bagels, Plain', 'Laceration of intrinsic muscle, fascia and tendon of left ring finger at wrist and hand level', 94, 2);
insert into product (name, description, point, category_id) values ('Pasta - Lasagna Noodle, Frozen', 'Legal intervention involving injury by explosive shell, suspect injured, subsequent encounter', 33, 1);
insert into product (name, description, point, category_id) values ('Puree - Guava', 'Underdosing of anthelminthics, initial encounter', 69, 1);
insert into product (name, description, point, category_id) values ('Paper - Brown Paper Mini Cups', 'Recurrent and persistent hematuria', 39, 2);
insert into product (name, description, point, category_id) values ('Wine - Manischewitz Concord', 'Strain of intrinsic muscle, fascia and tendon of left little finger at wrist and hand level, subsequent encounter', 8, 2);
insert into product (name, description, point, category_id) values ('Onions - Red Pearl', 'Unspecified injury of long flexor muscle, fascia and tendon of right thumb at wrist and hand level, subsequent encounter', 89, 2);
insert into product (name, description, point, category_id) values ('Bread - Roll, Calabrese', 'Mechanical complication of other bone devices, implants and grafts', 1, 2);
insert into product (name, description, point, category_id) values ('Chips - Miss Vickies', 'Intentional self-harm by steam or hot vapors, initial encounter', 38, 1);
insert into product (name, description, point, category_id) values ('Pie Shells 10', 'Poisoning by aspirin, accidental (unintentional), sequela', 23, 1);
insert into product (name, description, point, category_id) values ('Tart - Butter Plain Squares', 'Partial traumatic transphalangeal amputation of left index finger', 98, 2);
insert into product (name, description, point, category_id) values ('Chicken - Soup Base', 'Unspecified injury of ulnar artery at wrist and hand level of right arm, subsequent encounter', 62, 1);
insert into product (name, description, point, category_id) values ('Grapefruit - Pink', 'Person on outside of ambulance or fire engine injured in nontraffic accident, initial encounter', 1, 1);
insert into product (name, description, point, category_id) values ('Cheese - Mozzarella, Buffalo', 'Inhalant dependence, uncomplicated', 16, 1);
insert into product (name, description, point, category_id) values ('Corn - Mini', 'Laceration of other specified intrathoracic organs', 41, 1);
insert into product (name, description, point, category_id) values ('Yogurt - Plain', 'Toxic effect of fluorine gas and hydrogen fluoride, assault, subsequent encounter', 21, 2);
insert into product (name, description, point, category_id) values ('Soup - Campbells Tomato Ravioli', 'Other specified complications of surgical and medical care, not elsewhere classified', 40, 2);
insert into product (name, description, point, category_id) values ('Muffin Mix - Lemon Cranberry', 'War operations involving other fires, conflagrations and hot substances, civilian, sequela', 6, 1);
insert into product (name, description, point, category_id) values ('Cookie Dough - Chunky', 'Displaced fracture of lower epiphysis (separation) of left femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion', 47, 1);
insert into product (name, description, point, category_id) values ('Flour - Fast / Rapid', 'Malignant neoplasm of overlapping sites of vulva', 28, 2);
insert into product (name, description, point, category_id) values ('Beets', 'Arnold-Chiari syndrome', 32, 2);
insert into product (name, description, point, category_id) values ('Sword Pick Asst', 'Other megacolon', 81, 2);
insert into product (name, description, point, category_id) values ('Sugar - White Packet', 'Malignant neoplasm of unspecified bones and articular cartilage of left limb', 99, 2);

insert into challenge (title, description, point, type) values ('Administrative Assistant II', 'Coxa magna, left hip', 26, 3);
insert into challenge (title, description, point, type) values ('Director of Sales', 'Nondisp oblique fx shaft of unsp rad, 7thM', 48, 1);
insert into challenge (title, description, point, type) values ('Payment Adjustment Coordinator', 'Congenital malformation of aorta unspecified', 72, 4);
insert into challenge (title, description, point, type) values ('Product Engineer', 'Calcific tendinitis of right shoulder', 83, 2);
insert into challenge (title, description, point, type) values ('Tax Accountant', 'Hematoma of pinna', 68, 2);
insert into challenge (title, description, point, type) values ('Food Chemist', 'Rebound abdominal tenderness, unspecified site', 17, 2);
insert into challenge (title, description, point, type) values ('Assistant Professor', 'Laceration w foreign body of left thumb with damage to nail', 95, 4);
insert into challenge (title, description, point, type) values ('Technical Writer', 'Displaced Maisonneuve''s fracture of unsp leg, init', 87, 3);
insert into challenge (title, description, point, type) values ('Mechanical Systems Engineer', 'Other intestinal obstruction', 77, 3);
insert into challenge (title, description, point, type) values ('Teacher', 'Nondisp fx of hook pro of hamate bone, unsp wrs, 7thG', 34, 3);
insert into challenge (title, description, point, type) values ('Pharmacist', 'Displaced segmental fx shaft of ulna, right arm, sequela', 55, 1);
insert into challenge (title, description, point, type) values ('Quality Engineer', 'Poisoning by unspecified antidepressants, assault', 42, 2);
insert into challenge (title, description, point, type) values ('Tax Accountant', 'Displ transverse fx shaft of l ulna, 7thM', 71, 2);
insert into challenge (title, description, point, type) values ('Director of Sales', 'Unspecified physeal fracture of unspecified metatarsal, 7thB', 78, 1);
insert into challenge (title, description, point, type) values ('Account Executive', 'Toxic effect of soaps, intentional self-harm', 32, 2);
insert into challenge (title, description, point, type) values ('General Manager', 'Unsp trochan fx unsp femr, 7thH', 95, 2);
insert into challenge (title, description, point, type) values ('Help Desk Operator', 'Unspecified dacryocystitis of right lacrimal passage', 86, 3);
insert into challenge (title, description, point, type) values ('Software Consultant', 'Secondary and unspecified malignant neoplasm of lymph nodes', 98, 2);
insert into challenge (title, description, point, type) values ('Assistant Professor', 'Basketball court as place', 81, 4);
insert into challenge (title, description, point, type) values ('Programmer II', 'Sltr-haris Type I physl fx low end l fibula, 7thK', 48, 1);
insert into challenge (title, description, point, type) values ('Sales Representative', 'Matern care for known or susp placntl insuff, 2nd tri, fts4', 95, 2);
insert into challenge (title, description, point, type) values ('Environmental Specialist', 'Nondisp pilon fx r tibia, 7thE', 95, 3);
insert into challenge (title, description, point, type) values ('Product Engineer', 'Unsp pedl cyclst injured in collision w oth mv nontraf, subs', 1, 2);
insert into challenge (title, description, point, type) values ('Teacher', 'Minor laceration of right innominate or subclav art, init', 100, 1);
insert into challenge (title, description, point, type) values ('Compensation Analyst', 'Superficial foreign body of right hand, sequela', 27, 4);
insert into challenge (title, description, point, type) values ('Database Administrator III', 'Spacecraft accident injuring occupant', 79, 3);
insert into challenge (title, description, point, type) values ('Senior Quality Engineer', 'Toxic effect of ethanol, assault, subsequent encounter', 47, 1);
insert into challenge (title, description, point, type) values ('Chemical Engineer', 'Flail joint, shoulder', 22, 3);
insert into challenge (title, description, point, type) values ('Compensation Analyst', 'Unsp fx low end l ulna, 7thR', 45, 2);
insert into challenge (title, description, point, type) values ('Data Coordinator', 'Congenital stenosis and stricture of lacrimal duct', 10, 3);
insert into challenge (title, description, point, type) values ('Senior Sales Associate', 'Puncture wound with foreign body, right foot', 62, 3);
insert into challenge (title, description, point, type) values ('Sales Associate', 'Mammographic calcifcn found on diagnostic imaging of breast', 26, 2);
insert into challenge (title, description, point, type) values ('Accounting Assistant III', 'Unsp pedl cyclst inj in clsn w rail trn/veh nontraf, init', 53, 1);
insert into challenge (title, description, point, type) values ('Environmental Tech', 'Displ oblique fx shaft of r femr, 7thK', 13, 2);
insert into challenge (title, description, point, type) values ('Product Engineer', 'Lacerat unsp blood vessel at lower leg level, left leg, init', 21, 4);
insert into challenge (title, description, point, type) values ('Software Engineer III', 'Toxic effect of unspecified seafood', 29, 3);
insert into challenge (title, description, point, type) values ('Social Worker', 'Chondromalacia, unspecified shoulder', 5, 3);
insert into challenge (title, description, point, type) values ('Dental Hygienist', 'Burn of second degree of left knee', 52, 4);
insert into challenge (title, description, point, type) values ('Statistician IV', 'Unspecified injury of right elbow, subsequent encounter', 78, 4);
insert into challenge (title, description, point, type) values ('Staff Scientist', 'Corrosion of third degree of unspecified ear, subs encntr', 30, 4);
insert into challenge (title, description, point, type) values ('Financial Advisor', 'Path fx in neopltc dis, unsp tibia & fibula, 7thK', 95, 4);
insert into challenge (title, description, point, type) values ('Administrative Assistant I', 'Sltr-haris Type II physl fx upr end humer, unsp arm, 7thP', 53, 3);
insert into challenge (title, description, point, type) values ('Biostatistician IV', 'Other reduction deformities of brain', 7, 3);
insert into challenge (title, description, point, type) values ('Safety Technician I', 'Coma scale, best motor response, extension', 75, 2);
insert into challenge (title, description, point, type) values ('Web Designer IV', 'War op w unsp fire/conflagr/hot subst, civilian, sequela', 95, 2);
insert into challenge (title, description, point, type) values ('Dental Hygienist', 'Superficial foreign body of oth part of neck, init encntr', 51, 4);
insert into challenge (title, description, point, type) values ('Assistant Manager', 'Disord of branched-chain amino-acid metab & fatty-acid metab', 58, 3);
insert into challenge (title, description, point, type) values ('Biostatistician II', 'Lacerat blood vessels at lower leg level, right leg, sequela', 77, 2);
insert into challenge (title, description, point, type) values ('Compensation Analyst', 'Inhalant dependence with inhalant-induced dementia', 9, 1);
insert into challenge (title, description, point, type) values ('Database Administrator II', 'Sltr-haris Type II physl fx low end ulna, unsp arm, 7thD', 3, 4);
insert into challenge (title, description, point, type) values ('Accounting Assistant II', 'Sledder colliding with stationary object, subs encntr', 9, 3);
insert into challenge (title, description, point, type) values ('Desktop Support Technician', 'Passenger in hv veh injured in clsn w unsp mv nontraf, subs', 83, 4);
insert into challenge (title, description, point, type) values ('Nurse Practicioner', 'Urinary tract infection following delivery, unspecified', 10, 1);
insert into challenge (title, description, point, type) values ('Electrical Engineer', 'Nondisp fx of prox phalanx of l little fngr, init for opn fx', 75, 2);
insert into challenge (title, description, point, type) values ('Research Assistant II', 'Poisoning by antithyroid drugs, assault, initial encounter', 59, 1);
insert into challenge (title, description, point, type) values ('Data Coordinator', 'Presence of artificial limb (complete) (partial), unsp', 10, 3);
insert into challenge (title, description, point, type) values ('Senior Financial Analyst', '4-part fx surgical neck of unsp humerus, init for opn fx', 16, 2);
insert into challenge (title, description, point, type) values ('Statistician IV', 'Laceration without foreign body of thumb with damage to nail', 61, 3);
insert into challenge (title, description, point, type) values ('Speech Pathologist', 'Primary iridocyclitis, bilateral', 7, 2);
insert into challenge (title, description, point, type) values ('Recruiting Manager', 'Burn of unspecified degree of upper back, initial encounter', 79, 3);
insert into challenge (title, description, point, type) values ('Software Consultant', 'Siderosis of eye, right eye', 21, 4);
insert into challenge (title, description, point, type) values ('Automation Specialist III', 'Nonrheumatic aortic valve disorder, unspecified', 12, 3);
insert into challenge (title, description, point, type) values ('Geological Engineer', 'Oth soft tissue disord related to use/pressure, left thigh', 6, 2);
insert into challenge (title, description, point, type) values ('Project Manager', 'Disp fx of l tibial tuberosity, 7thD', 100, 1);
insert into challenge (title, description, point, type) values ('Design Engineer', 'Other specified injury of femoral artery, unspecified leg', 40, 2);
insert into challenge (title, description, point, type) values ('Research Assistant III', 'Nondisp fx of nk of scapula, l shldr, subs for fx w malunion', 10, 3);
insert into challenge (title, description, point, type) values ('Chemical Engineer', 'Acute miliary tuberculosis of multiple sites', 44, 3);
insert into challenge (title, description, point, type) values ('Office Assistant III', 'Other specified metabolic disorders', 92, 3);
insert into challenge (title, description, point, type) values ('Media Manager III', 'Cholesteatoma of attic, right ear', 49, 3);
insert into challenge (title, description, point, type) values ('Account Executive', 'Oth complications of procedures, NEC, subs', 54, 4);
insert into challenge (title, description, point, type) values ('Payment Adjustment Coordinator', 'Miltry op w nuclr radiation eff of nuclr weapon, milt, init', 40, 4);
insert into challenge (title, description, point, type) values ('Compensation Analyst', 'Bone marrow transplant rejection', 87, 4);
insert into challenge (title, description, point, type) values ('Media Manager II', 'Displ oblique fx shaft of unsp ulna, 7thQ', 100, 4);
insert into challenge (title, description, point, type) values ('Marketing Manager', 'Unsp injury of msl/tnd of front wall of thorax, init', 65, 2);
insert into challenge (title, description, point, type) values ('Human Resources Assistant I', 'Unsp comp of fb acc left in body fol infusn/transfusn, subs', 99, 1);
insert into challenge (title, description, point, type) values ('Legal Assistant', 'Poisoning by histamine H2-receptor blockers, accidental', 80, 4);
insert into challenge (title, description, point, type) values ('Paralegal', 'Open bite of right great toe w/o damage to nail, init encntr', 98, 2);
insert into challenge (title, description, point, type) values ('Business Systems Development Analyst', 'Personal history of malig neoplasm of eye and nervous tissue', 23, 2);
insert into challenge (title, description, point, type) values ('Staff Accountant II', 'Pleural plaque without asbestos', 12, 3);
insert into challenge (title, description, point, type) values ('Account Representative II', 'Unsp inj extensor musc/fasc/tend r rng fngr at wrs/hnd lv', 74, 3);
insert into challenge (title, description, point, type) values ('Senior Cost Accountant', 'Osteochondritis dissecans, unspecified wrist', 33, 2);
insert into challenge (title, description, point, type) values ('Developer IV', 'Oth nondisp fx of base of 1st MC bone, unsp hand, 7thD', 52, 3);
insert into challenge (title, description, point, type) values ('Graphic Designer', 'Monoclonal mast cell activation syndrome', 17, 1);
insert into challenge (title, description, point, type) values ('Account Coordinator', 'Leakage of graft of urinary organ, subsequent encounter', 84, 4);
insert into challenge (title, description, point, type) values ('Statistician II', 'Poisoning by unsp anesthetic, intentional self-harm, subs', 12, 4);
insert into challenge (title, description, point, type) values ('Programmer I', 'Injury of other nerves at forearm level, right arm', 19, 4);
insert into challenge (title, description, point, type) values ('VP Sales', 'Posterior subluxation of proximal end of tibia, left knee', 34, 4);
insert into challenge (title, description, point, type) values ('Recruiter', 'Subluxation of T5/T6 thoracic vertebra, initial encounter', 92, 2);
insert into challenge (title, description, point, type) values ('Assistant Professor', 'Lacerat intrns musc/fasc/tend and unsp finger at wrs/hnd lv', 46, 3);
insert into challenge (title, description, point, type) values ('Desktop Support Technician', 'Poisoning by oth narcotics, intentional self-harm, init', 35, 4);
insert into challenge (title, description, point, type) values ('Administrative Officer', 'Oth benign neoplasm skin/ right ear and external auric canal', 79, 2);
insert into challenge (title, description, point, type) values ('Desktop Support Technician', 'Other fracture of left talus, init encntr for open fracture', 50, 4);
insert into challenge (title, description, point, type) values ('Financial Advisor', 'Histamine H2-receptor blockers', 34, 4);
insert into challenge (title, description, point, type) values ('Software Engineer III', 'Milt op w direct blast effect of nuclr weapon, milt, sequela', 68, 2);
insert into challenge (title, description, point, type) values ('Cost Accountant', 'Unspecified acute lower respiratory infection', 74, 3);
insert into challenge (title, description, point, type) values ('Tax Accountant', 'Multiple perforations of tympanic membrane', 56, 4);
insert into challenge (title, description, point, type) values ('Chemical Engineer', 'Other primary thrombocytopenia', 66, 3);
insert into challenge (title, description, point, type) values ('Structural Engineer', 'Encntr for surgical aftcr following surgery on the circ sys', 7, 1);
insert into challenge (title, description, point, type) values ('Senior Quality Engineer', 'Assault by unspecified explosive, sequela', 3, 4);
insert into challenge (title, description, point, type) values ('Project Manager', 'Disp fx of lateral condyle of unsp tibia, 7thC', 50, 1);

insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-780 - Clay Unit Pavers', 'Pyrexia of unknown origin following delivery', 'Debate', 176, 387, '2022-10-12 16:41:42', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('9-500 - Ceilings', 'Cocaine abuse with cocaine-induced anxiety disorder', 'Q&A', 299, 374, '2022-01-15 22:17:19', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('13-170 - Tubs and Pools', 'Drug or chemical induced diabetes mellitus with proliferative diabetic retinopathy with combined traction retinal detachment and rhegmatogenous retinal detachment, bilateral', 'Debate', 103, 316, '2023-02-20 10:11:24', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('6-100 - Rough Carpentry', 'Inhalant dependence, uncomplicated', 'Debate', 196, 62, '2022-04-16 03:39:36', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('15-600 - Refrigeration Equipment', 'Displaced oblique fracture of shaft of right tibia, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with delayed healing', 'Debate', 195, 248, '2024-05-10 11:34:20', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('11-480 - Athletic, Recreational, and Therapeutic Equipment', 'Laceration of thoracic trachea', 'Debate', 360, 208, '2022-07-14 04:49:54', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1-515 - Temporary Lighting', 'Laceration of prostate, sequela', 'Debate', 212, 203, '2022-05-10 09:25:25', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1-500 - Temporary Facilities and Controls', 'Laceration of unspecified blood vessel at lower leg level, unspecified leg, sequela', 'Q&A', 201, 182, '2023-06-01 11:33:18', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-932 - PLants and Bulbs', 'Drowning and submersion due to falling or jumping from crushed (nonpowered) inflatable craft, subsequent encounter', 'Q&A', 158, 118, '2020-06-23 15:08:56', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('9-900 - Paints and Coatings', 'Acute embolism and thrombosis of unspecified veins of unspecified upper extremity', 'Q&A', 341, 256, '2020-11-21 01:58:52', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('16-400 - Low-Voltage Distribution', 'Burn of second degree of lower back, sequela', 'Q&A', 217, 54, '2024-01-30 14:29:11', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('5-050 - Basic Metal Materials and Methods', 'Maternal care for hydrops fetalis, third trimester, fetus 1', 'Q&A', 366, 399, '2024-02-29 10:56:45', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('8-900 - Glazed Curtain Wall', 'Other meniscus derangements, posterior horn of lateral meniscus, unspecified knee', 'Q&A', 301, 312, '2020-08-11 08:59:18', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-240 - Grilles and Screens', 'Frostbite with tissue necrosis of left ankle, initial encounter', 'Debate', 193, 98, '2020-10-12 01:01:27', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-815 - Fountains', 'Placentitis, first trimester, other fetus', 'Debate', 274, 391, '2021-03-18 14:41:28', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1-010 - Project Manager', 'Adverse effect of antimycobacterial drugs, subsequent encounter', 'Q&A', 370, 317, '2024-06-01 23:07:10', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('6-050 - Basic Wood and Plastic Materials and Methods', 'Passenger of other special all-terrain or other off-road motor vehicle injured in traffic accident, subsequent encounter', 'Debate', 274, 308, '2022-12-01 05:06:23', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('17-030 - Bond', 'Minor laceration of right kidney, sequela', 'Debate', 243, 364, '2023-08-15 05:13:13', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('15 - Mechanical', 'Postprocedural urethral stricture, female', 'Q&A', 248, 231, '2020-09-09 11:36:28', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('4-500 - Refractories', 'Other fracture of fifth metacarpal bone, right hand, subsequent encounter for fracture with delayed healing', 'Q&A', 214, 305, '2020-11-26 13:51:04', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('4 - Masonry', 'Burn of first degree of shoulder', 'Debate', 279, 96, '2022-08-16 15:00:33', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('11-070 - Instrumental Equipment', 'Other paralytic syndrome following unspecified cerebrovascular disease affecting right dominant side', 'Debate', 366, 398, '2024-01-12 17:42:32', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('7-700 - Roof Specialties and Accessories', 'Contact with garden tool, subsequent encounter', 'Debate', 349, 252, '2021-12-22 06:05:57', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-300 - Earthwork', 'Animal-rider injured in transport accident with military vehicle, initial encounter', 'Debate', 117, 197, '2023-03-24 13:49:19', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1-540 - Construction Aids', 'Posterior dislocation of right humerus, sequela', 'Q&A', 299, 59, '2022-01-15 18:30:20', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('15-500 - Heat-Generation Equipment', 'Poisoning by antimalarials and drugs acting on other blood protozoa, intentional self-harm, subsequent encounter', 'Debate', 394, 278, '2021-12-29 18:35:40', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('14-300 - Escalators and Moving Walks', 'Crushing injury of left wrist, subsequent encounter', 'Debate', 128, 250, '2023-12-28 23:40:19', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('8 - Doors and Windows', 'Displaced avulsion fracture (chip fracture) of right talus, initial encounter for closed fracture', 'Debate', 89, 104, '2021-06-24 00:19:48', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('5-500 - Metal Fabrications', 'Corrosion of second degree of multiple sites of right wrist and hand, sequela', 'Debate', 356, 309, '2024-05-31 05:10:34', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('11-190 - Detention Equipment', 'Displaced oblique fracture of shaft of right ulna, initial encounter for closed fracture', 'Debate', 347, 202, '2022-03-14 00:47:52', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1-013 - Project Coordinator', 'Laceration of other specified muscles, fascia and tendons at thigh level, left thigh, sequela', 'Q&A', 83, 164, '2020-07-16 00:04:08', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-795 - Porous Paving', 'Breakdown (mechanical) of carotid arterial graft (bypass), sequela', 'Q&A', 164, 96, '2022-02-25 12:27:10', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('11-010 - Maintenance Equipment', 'Salter-Harris Type I physeal fracture of upper end of unspecified fibula, subsequent encounter for fracture with malunion', 'Q&A', 53, 218, '2021-07-04 10:19:02', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-500 - Lockers', 'Other specified injury of intercostal blood vessels, right side, initial encounter', 'Q&A', 90, 337, '2020-10-13 23:32:52', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('12-900 - Furnishings Restoration and Repair', 'Complete traumatic amputation of one lesser toe', 'Debate', 65, 221, '2020-12-02 18:57:47', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('13-160 - Aquariums', 'Poisoning by otorhinolaryngological drugs and preparations, accidental (unintentional)', 'Debate', 359, 157, '2023-01-31 12:42:57', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('9-250 - Gypsum Wallboard', 'LeFort I fracture, subsequent encounter for fracture with delayed healing', 'Debate', 380, 66, '2023-03-17 22:19:11', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-370 - Erosion and Sedimentation Control', 'Nondisplaced fracture of distal phalanx of right little finger, sequela', 'Q&A', 271, 395, '2020-09-18 14:03:59', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('8-400 - Entrances and Storefronts', 'Other necrotizing vasculopathies', 'Debate', 284, 284, '2021-10-30 12:34:56', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-820 - Fences and Gates', 'Mood disorder due to known physiological condition with depressive features', 'Q&A', 249, 183, '2021-03-22 17:24:08', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-520 - Fire Protection Specialties', 'Displaced spiral fracture of shaft of unspecified fibula, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion', 'Q&A', 225, 237, '2021-11-27 05:42:48', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('16-400 - Low-Voltage Distribution', 'Contact with other hot metals, sequela', 'Debate', 296, 323, '2024-04-05 13:37:10', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-823 - PVC Fences and Gates', 'Strain of intrinsic muscle, fascia and tendon of left ring finger at wrist and hand level', 'Q&A', 216, 377, '2023-12-31 16:37:59', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-250 - Shoring and Underpinning', 'Pressure ulcer of right upper back, unstageable', 'Q&A', 110, 192, '2021-11-12 22:09:43', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('3-330 - Poured Concrete Basement Walls', 'Burn of second degree of single left finger (nail) except thumb, sequela', 'Debate', 212, 148, '2021-12-27 10:55:37', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1-012 - Superintendent', 'Flood, subsequent encounter', 'Q&A', 389, 221, '2023-07-10 19:23:08', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('3-540 - Cementitious Underlayments', 'Unspecified fracture of left forearm, initial encounter for open fracture type I or II', 'Q&A', 344, 344, '2023-08-19 12:04:39', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1 - General Requirements', 'Nondisplaced subtrochanteric fracture of left femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with malunion', 'Debate', 377, 208, '2023-02-21 03:48:43', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('7-100 - Damproofing and Waterproofing', 'Military operations involving unintentional restriction of air and airway, military personnel, sequela', 'Debate', 344, 211, '2023-07-24 09:22:22', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('3-330 - Poured Concrete Basement Walls', 'Other fracture of T7-T8 thoracic vertebra, initial encounter for open fracture', 'Debate', 59, 200, '2024-03-01 05:48:48', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('8-200 - Wood and Plastic Doors', 'Alcohol abuse with alcohol-induced anxiety disorder', 'Q&A', 256, 169, '2021-09-02 07:08:16', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('3-540 - Cementitious Underlayments', 'Poisoning by antineoplastic and immunosuppressive drugs, accidental (unintentional), initial encounter', 'Q&A', 108, 175, '2023-02-11 07:03:18', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('7-500 - Membrane Roofing', 'Burn of unspecified degree of left palm', 'Debate', 146, 105, '2023-07-30 17:57:57', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('17 - Markup and Contingency', 'Displaced fracture of proximal phalanx of left great toe, initial encounter for closed fracture', 'Q&A', 367, 300, '2020-07-24 06:29:20', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('15-500 - Heat-Generation Equipment', 'Maternal care for Anti-A sensitization, first trimester, not applicable or unspecified', 'Debate', 209, 98, '2020-07-10 18:09:17', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('11-040 - Ecclesiastical Equipment', 'Other intraarticular fracture of lower end of right radius, subsequent encounter for open fracture type I or II with malunion', 'Q&A', 77, 228, '2021-02-12 10:44:17', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-230 - Site Clearing', 'Strain of other specified muscles and tendons at ankle and foot level, left foot, sequela', 'Q&A', 341, 207, '2021-03-24 23:49:41', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('17-020 - Insurance', 'Keratoconjunctivitis sicca, not specified as Sjogren''s', 'Debate', 157, 363, '2023-06-18 02:39:55', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-750 - Telephone Specialties', 'Cutaneous abscess of limb, unspecified', 'Debate', 56, 125, '2020-10-24 11:49:29', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('7-500 - Membrane Roofing', 'Pathological fracture in neoplastic disease, right tibia', 'Debate', 244, 53, '2023-04-18 16:23:21', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('13-900 - Fire Suppression', 'Other specified type of carcinoma in situ of left breast', 'Q&A', 180, 318, '2023-04-16 17:17:52', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1-560 - Temporary Barriers and Enclosures', 'Disorder of urea cycle metabolism, unspecified', 'Debate', 195, 367, '2021-09-18 01:25:32', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('16-100 - Electrical', 'Other specified injury of right renal artery, sequela', 'Q&A', 209, 236, '2020-11-06 13:03:11', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-550 - Postal Specialties', 'Abrasion of unspecified parts of thorax, sequela', 'Debate', 90, 100, '2023-11-15 04:22:36', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('15-200 - Process Piping', 'Unspecified injury of muscle(s) and tendon(s) of peroneal muscle group at lower leg level, unspecified leg, subsequent encounter', 'Q&A', 144, 164, '2021-09-05 17:13:53', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-783 - Interlocking Concrete Unit Paving', 'Unspecified fracture of head of left femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with delayed healing', 'Q&A', 242, 131, '2023-04-20 09:58:46', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('15-800 - Air Distribution', 'Burn of first degree of ear [any part, except ear drum]', 'Q&A', 379, 345, '2023-01-17 13:38:14', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-260 - Wall and Corner Guards', 'Poisoning by ophthalmological drugs and preparations, accidental (unintentional)', 'Q&A', 139, 175, '2023-09-28 02:49:54', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('6-050 - Basic Wood and Plastic Materials and Methods', 'Nondisplaced articular fracture of head of right femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with delayed healing', 'Debate', 221, 182, '2021-03-07 01:59:25', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('9-250 - Gypsum Wallboard', 'Displaced fracture of medial malleolus of unspecified tibia, initial encounter for closed fracture', 'Debate', 187, 299, '2020-08-12 07:48:16', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('8-200 - Wood and Plastic Doors', 'Driver of special construction vehicle injured in nontraffic accident, subsequent encounter', 'Q&A', 116, 229, '2023-10-21 04:44:36', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('11-110 - Commercial Laundry and Dry Cleaning Equipment', 'Hemiplegia and hemiparesis following other nontraumatic intracranial hemorrhage affecting left dominant side', 'Debate', 176, 323, '2022-05-03 07:21:15', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('15-050 - Basic Mechanical Materials and Methods', 'Sprain of metatarsophalangeal joint of right lesser toe(s), initial encounter', 'Q&A', 311, 397, '2023-09-07 08:01:41', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('14-400 - Lifts', 'Unspecified fracture of the lower end of right radius, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion', 'Q&A', 374, 309, '2022-11-10 02:07:09', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-740 - Flexible Pavement Asphalt Pavement', 'Unspecified malignant neoplasm of skin of trunk', 'Q&A', 247, 237, '2020-12-04 04:40:41', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-530 - Protective Covers', 'Effect of air pressure and water pressure, unspecified, initial encounter', 'Q&A', 57, 199, '2022-09-05 19:54:04', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('11-140 - Vehicle Service Equipment', 'Unspecified fracture of shaft of unspecified radius, initial encounter for open fracture type IIIA, IIIB, or IIIC', 'Q&A', 201, 345, '2022-12-16 01:04:09', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('13-175 - Ice Rinks', 'Toxic effect of contact with venomous marine plant, intentional self-harm', 'Q&A', 168, 317, '2021-09-10 22:06:15', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-350 - Flagpoles', 'Displaced spiral fracture of shaft of humerus, right arm, subsequent encounter for fracture with nonunion', 'Debate', 208, 68, '2023-08-31 22:41:34', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('5-100 - Structural Metals', 'Laceration of muscle(s) and tendon(s) of peroneal muscle group at lower leg level', 'Debate', 90, 140, '2021-04-02 04:15:23', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('3 - Concrete', 'Other specified joint disorders, left ankle and foot', 'Q&A', 101, 55, '2022-07-26 01:06:20', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-400 - Identification Devices', 'Breakdown (mechanical) of internal fixation device of left humerus, initial encounter', 'Debate', 288, 119, '2021-06-27 02:16:03', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-800 - Toilet, Bath, and Laundry Specialties', 'Nondisplaced comminuted fracture of shaft of radius, right arm, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with delayed healing', 'Debate', 52, 86, '2024-01-15 05:51:36', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1-014 - Project Executive', 'Other infective spondylopathies', 'Debate', 259, 160, '2023-05-28 08:04:23', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('13-260 - Sludge Conditioning Systems', 'Noninfective neonatal diarrhea', 'Q&A', 132, 381, '2022-04-15 00:11:37', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('9-900 - Paints and Coatings', 'Anemia complicating pregnancy, unspecified trimester', 'Debate', 111, 148, '2021-09-09 05:41:20', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('6-100 - Rough Carpentry', 'Burns of other specified parts of left eye and adnexa', 'Debate', 217, 367, '2020-12-01 22:24:32', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('17-040 - Profit', 'Idiopathic cysts of iris, ciliary body or anterior chamber', 'Debate', 378, 85, '2023-09-12 04:23:32', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('9-700 - Wall Finishes', 'Rheumatoid polyneuropathy with rheumatoid arthritis of right shoulder', 'Debate', 78, 140, '2022-10-10 08:40:58', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('12-050 - Fabrics', 'Car passenger injured in collision with two- or three-wheeled motor vehicle in nontraffic accident, initial encounter', 'Debate', 130, 308, '2021-12-04 12:11:42', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('14-600 - Hoists and Cables', 'Toxic effect of carbon monoxide from motor vehicle exhaust, intentional self-harm, initial encounter', 'Q&A', 94, 98, '2024-04-16 06:54:11', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('9-600 - Flooring', 'Unspecified open wound of left front wall of thorax with penetration into thoracic cavity, sequela', 'Q&A', 147, 260, '2020-09-14 18:17:38', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('16-700 - Communications', 'Passenger of ambulance or fire engine injured in nontraffic accident, subsequent encounter', 'Debate', 347, 239, '2021-10-24 20:58:29', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('10-270 - Access Flooring', 'Subluxation of proximal interphalangeal joint of unspecified thumb, initial encounter', 'Debate', 253, 194, '2023-03-02 02:27:26', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('1-600 - Product Requirements (Scope of Work)', 'Injury of median nerve at upper arm level, right arm', 'Q&A', 378, 271, '2023-01-27 05:08:42', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('2-784 - Stone Unit Pavers', 'Burn of unspecified internal organ, subsequent encounter', 'Q&A', 383, 115, '2022-01-07 20:29:24', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('11-200 - Water Supply and Treatment Equipment', 'Anterior subcapsular polar age-related cataract', 'Debate', 156, 182, '2021-03-07 13:16:25', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('16-300 - Transmission and Distribution', 'Salter-Harris Type III physeal fracture of upper end of humerus, left arm, subsequent encounter for fracture with malunion', 'Q&A', 215, 302, '2020-09-15 20:28:07', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('17-030 - Bond', 'Other atopic dermatitis', 'Q&A', 102, 180, '2024-04-23 13:25:29', 1);
insert into community (title, description, type, agree, disagree, created_date, user_id) values ('5-050 - Basic Metal Materials and Methods', 'Fracture of angle of mandible, unspecified side', 'Debate', 293, 162, '2024-01-29 00:27:55', 1);

insert into comments (description, user_id, community_id, created_date) values ('Tobacco abuse counseling', 1, 38, '2024-02-12 16:00:37');
insert into comments (description, user_id, community_id, created_date) values ('Greenstick fracture of shaft of unspecified ulna, sequela', 1, 53, '2021-03-02 23:41:18');
insert into comments (description, user_id, community_id, created_date) values ('Laceration without foreign body of right little finger without damage to nail, subsequent encounter', 1, 50, '2022-01-05 18:28:46');
insert into comments (description, user_id, community_id, created_date) values ('Laceration without foreign body, right foot, sequela', 1, 71, '2023-08-04 11:44:59');
insert into comments (description, user_id, community_id, created_date) values ('Displacement of insulin pump, sequela', 1, 62, '2023-08-21 11:39:36');
insert into comments (description, user_id, community_id, created_date) values ('Injury of axillary nerve, right arm', 1, 18, '2024-02-21 03:31:40');
insert into comments (description, user_id, community_id, created_date) values ('Newborn affected by abnormal uterine contractions', 1, 90, '2021-02-02 03:37:25');
insert into comments (description, user_id, community_id, created_date) values ('Irregular astigmatism, left eye', 1, 8, '2021-04-07 09:30:15');
insert into comments (description, user_id, community_id, created_date) values ('Corrosion of cornea and conjunctival sac, left eye, subsequent encounter', 1, 7, '2020-09-25 15:53:06');
insert into comments (description, user_id, community_id, created_date) values ('Other complications following immunization, not elsewhere classified', 1, 98, '2023-09-03 06:40:55');
insert into comments (description, user_id, community_id, created_date) values ('Unspecified disorder of patella, right knee', 1, 68, '2023-10-26 15:35:42');
insert into comments (description, user_id, community_id, created_date) values ('Other mechanical complication of other vascular grafts, subsequent encounter', 1, 71, '2024-06-03 14:43:40');
insert into comments (description, user_id, community_id, created_date) values ('Hunting rifle discharge, undetermined intent, subsequent encounter', 1, 3, '2023-12-31 12:13:42');
insert into comments (description, user_id, community_id, created_date) values ('Burn of third degree of unspecified thumb (nail), subsequent encounter', 1, 29, '2022-08-30 15:34:03');
insert into comments (description, user_id, community_id, created_date) values ('Toxic effect of carbon dioxide, intentional self-harm', 1, 37, '2022-04-30 23:46:46');
insert into comments (description, user_id, community_id, created_date) values ('Sprain of carpal joint of right wrist', 1, 91, '2022-10-16 01:18:35');
insert into comments (description, user_id, community_id, created_date) values ('Unspecified foreign body in pharynx causing other injury', 1, 21, '2024-05-30 21:18:39');
insert into comments (description, user_id, community_id, created_date) values ('Displaced spiral fracture of shaft of left fibula, initial encounter for open fracture type I or II', 1, 12, '2021-04-04 21:09:17');
insert into comments (description, user_id, community_id, created_date) values ('Congenital bladder neck obstruction', 1, 65, '2021-02-10 17:16:04');
insert into comments (description, user_id, community_id, created_date) values ('Salter-Harris Type I physeal fracture of unspecified metatarsal', 1, 19, '2022-11-24 11:22:50');
insert into comments (description, user_id, community_id, created_date) values ('Unspecified chronic inflammatory disorders of orbit', 1, 100, '2020-07-09 20:23:01');
insert into comments (description, user_id, community_id, created_date) values ('Laceration of other muscles, fascia and tendons at forearm level, unspecified arm', 1, 52, '2021-04-10 02:39:31');
insert into comments (description, user_id, community_id, created_date) values ('Greenstick fracture of shaft of radius, right arm, subsequent encounter for fracture with malunion', 1, 88, '2023-08-15 00:48:24');
insert into comments (description, user_id, community_id, created_date) values ('External constriction of right shoulder, initial encounter', 1, 86, '2021-09-08 09:07:19');
insert into comments (description, user_id, community_id, created_date) values ('Injury of dorsal artery of foot', 1, 94, '2022-02-13 04:29:24');
insert into comments (description, user_id, community_id, created_date) values ('Stress fracture, unspecified shoulder, subsequent encounter for fracture with nonunion', 1, 65, '2020-09-16 10:37:07');
insert into comments (description, user_id, community_id, created_date) values ('Choroidal detachment', 1, 58, '2022-10-09 04:55:04');
insert into comments (description, user_id, community_id, created_date) values ('Atherosclerosis of native arteries of extremities with intermittent claudication, bilateral legs', 1, 45, '2021-05-26 02:03:57');
insert into comments (description, user_id, community_id, created_date) values ('Foreign body in other and multiple parts of external eye, right eye', 1, 32, '2023-07-16 02:37:28');
insert into comments (description, user_id, community_id, created_date) values ('Unspecified injury of unspecified ankle', 1, 57, '2022-04-22 22:10:19');
insert into comments (description, user_id, community_id, created_date) values ('Sprain of ribs, sequela', 1, 13, '2024-01-25 14:40:25');
insert into comments (description, user_id, community_id, created_date) values ('Subacute osteomyelitis, left humerus', 1, 86, '2021-10-25 11:50:51');
insert into comments (description, user_id, community_id, created_date) values ('Nondisplaced intertrochanteric fracture of right femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion', 1, 88, '2023-05-07 23:14:44');
insert into comments (description, user_id, community_id, created_date) values ('Cortical age-related cataract, bilateral', 1, 18, '2023-03-18 10:51:08');
insert into comments (description, user_id, community_id, created_date) values ('Subluxation of proximal interphalangeal joint of unspecified thumb, initial encounter', 1, 15, '2022-03-29 19:38:31');
insert into comments (description, user_id, community_id, created_date) values ('Displaced bimalleolar fracture of left lower leg, subsequent encounter for closed fracture with malunion', 1, 31, '2020-08-03 10:47:29');
insert into comments (description, user_id, community_id, created_date) values ('Other specified injury of axillary artery, left side, subsequent encounter', 1, 69, '2022-05-14 16:30:26');
insert into comments (description, user_id, community_id, created_date) values ('Anterior cord syndrome at T1 level of thoracic spinal cord', 1, 57, '2023-03-13 08:37:04');
insert into comments (description, user_id, community_id, created_date) values ('Poisoning by cannabis (derivatives), undetermined, initial encounter', 1, 24, '2022-10-12 17:28:46');
insert into comments (description, user_id, community_id, created_date) values ('Displaced fracture of lunate [semilunar], left wrist, subsequent encounter for fracture with malunion', 1, 13, '2022-05-25 05:43:51');
insert into comments (description, user_id, community_id, created_date) values ('Burn of third degree of unspecified scapular region, subsequent encounter', 1, 99, '2021-03-05 23:59:36');
insert into comments (description, user_id, community_id, created_date) values ('Non-follicular (diffuse) lymphoma, unspecified, intrathoracic lymph nodes', 1, 65, '2023-08-16 18:33:42');
insert into comments (description, user_id, community_id, created_date) values ('Displaced fracture of medial malleolus of unspecified tibia', 1, 8, '2024-05-23 07:51:44');
insert into comments (description, user_id, community_id, created_date) values ('Nondisplaced fracture of medial condyle of unspecified humerus', 1, 77, '2020-06-17 09:19:26');
insert into comments (description, user_id, community_id, created_date) values ('Toxic effect of ingested berries, undetermined, initial encounter', 1, 40, '2020-08-28 12:34:06');
insert into comments (description, user_id, community_id, created_date) values ('Displaced fracture of proximal phalanx of left ring finger, initial encounter for open fracture', 1, 48, '2020-10-10 02:43:16');
insert into comments (description, user_id, community_id, created_date) values ('Other injury of adrenal gland, subsequent encounter', 1, 35, '2021-07-16 11:59:09');
insert into comments (description, user_id, community_id, created_date) values ('Poisoning by cannabis (derivatives), intentional self-harm, subsequent encounter', 1, 69, '2023-06-07 09:23:34');
insert into comments (description, user_id, community_id, created_date) values ('Mature T/NK-cell lymphomas, unspecified, lymph nodes of head, face, and neck', 1, 20, '2023-08-25 11:12:13');
insert into comments (description, user_id, community_id, created_date) values ('Open bite of scrotum and testes, subsequent encounter', 1, 74, '2021-02-10 11:32:49');
insert into comments (description, user_id, community_id, created_date) values ('Nondisplaced fracture of sternal end of right clavicle, initial encounter for open fracture', 1, 64, '2024-01-29 05:43:22');
insert into comments (description, user_id, community_id, created_date) values ('Stress fracture, left toe(s), subsequent encounter for fracture with nonunion', 1, 85, '2020-07-06 19:37:42');
insert into comments (description, user_id, community_id, created_date) values ('Other specified diabetes mellitus with moderate nonproliferative diabetic retinopathy with macular edema', 1, 95, '2021-04-26 00:40:19');
insert into comments (description, user_id, community_id, created_date) values ('Other private fixed-wing aircraft explosion injuring occupant, initial encounter', 1, 94, '2023-01-17 13:22:26');
insert into comments (description, user_id, community_id, created_date) values ('Other secondary chronic gout, right hip, with tophus (tophi)', 1, 11, '2023-02-16 17:25:44');
insert into comments (description, user_id, community_id, created_date) values ('Malar fracture, right side, sequela', 1, 9, '2023-07-24 04:13:50');
insert into comments (description, user_id, community_id, created_date) values ('Contusion, laceration, and hemorrhage of brainstem with loss of consciousness of any duration with death due to other cause prior to regaining consciousness, subsequent encounter', 1, 28, '2023-08-07 01:28:15');
insert into comments (description, user_id, community_id, created_date) values ('Insect bite (nonvenomous) of vagina and vulva, sequela', 1, 85, '2023-05-17 03:08:41');
insert into comments (description, user_id, community_id, created_date) values ('Displaced fracture of medial malleolus of right tibia, subsequent encounter for open fracture type I or II with nonunion', 1, 69, '2021-09-30 07:01:01');
insert into comments (description, user_id, community_id, created_date) values ('Displaced fracture of body of right talus, initial encounter for closed fracture', 1, 100, '2021-06-12 09:12:29');
insert into comments (description, user_id, community_id, created_date) values ('Nondisplaced fracture of medial condyle of right femur, initial encounter for closed fracture', 1, 71, '2023-09-28 01:35:09');
insert into comments (description, user_id, community_id, created_date) values ('Retinal ischemia', 1, 85, '2020-11-09 01:07:50');
insert into comments (description, user_id, community_id, created_date) values ('Stress fracture, left foot, sequela', 1, 25, '2021-01-23 02:37:25');
insert into comments (description, user_id, community_id, created_date) values ('Unspecified injury of abdominal aorta, subsequent encounter', 1, 12, '2024-02-06 16:53:46');
insert into comments (description, user_id, community_id, created_date) values ('Abrasion of vagina and vulva', 1, 90, '2022-03-04 21:07:25');
insert into comments (description, user_id, community_id, created_date) values ('Bitten by cat, sequela', 1, 20, '2024-05-03 14:37:48');
insert into comments (description, user_id, community_id, created_date) values ('Other chondrocalcinosis, unspecified site', 1, 94, '2024-03-11 13:24:03');
insert into comments (description, user_id, community_id, created_date) values ('Toxic effect of corrosive acids and acid-like substances, undetermined, subsequent encounter', 1, 21, '2021-11-14 18:58:23');
insert into comments (description, user_id, community_id, created_date) values ('Other specified injury of other blood vessels at abdomen, lower back and pelvis level, sequela', 1, 26, '2022-03-05 11:58:30');
insert into comments (description, user_id, community_id, created_date) values ('Nondisplaced fracture of medial phalanx of left little finger, subsequent encounter for fracture with delayed healing', 1, 76, '2024-02-04 15:41:00');
insert into comments (description, user_id, community_id, created_date) values ('Laceration of other specified muscles and tendons at ankle and foot level, left foot, initial encounter', 1, 71, '2021-04-10 06:54:28');
insert into comments (description, user_id, community_id, created_date) values ('Toxic effect of unspecified gases, fumes and vapors, undetermined, initial encounter', 1, 13, '2024-02-06 15:03:15');
insert into comments (description, user_id, community_id, created_date) values ('Pathological fracture, right tibia, sequela', 1, 4, '2023-04-06 11:57:54');
insert into comments (description, user_id, community_id, created_date) values ('Other and unspecified fall on same level', 1, 21, '2020-10-27 00:53:21');
insert into comments (description, user_id, community_id, created_date) values ('Nondisplaced articular fracture of head of left femur, subsequent encounter for open fracture type I or II with delayed healing', 1, 81, '2024-05-31 05:11:31');
insert into comments (description, user_id, community_id, created_date) values ('Exposure to other specified smoke, fire and flames, sequela', 1, 76, '2022-06-28 06:33:52');
insert into comments (description, user_id, community_id, created_date) values ('Other specified events, undetermined intent, subsequent encounter', 1, 12, '2020-08-09 00:23:14');
insert into comments (description, user_id, community_id, created_date) values ('Nondisplaced fracture of posterior wall of left acetabulum, initial encounter for open fracture', 1, 63, '2022-09-09 05:13:43');
insert into comments (description, user_id, community_id, created_date) values ('Person on outside of special construction vehicle injured in nontraffic accident', 1, 85, '2021-02-21 15:33:43');
insert into comments (description, user_id, community_id, created_date) values ('Cerebral infarction due to unspecified occlusion or stenosis of bilateral cerebellar arteries', 1, 94, '2023-09-11 14:00:37');
insert into comments (description, user_id, community_id, created_date) values ('Hallux valgus (acquired), right foot', 1, 54, '2022-10-04 11:49:57');
insert into comments (description, user_id, community_id, created_date) values ('Pseudopapilledema of optic disc, bilateral', 1, 41, '2023-03-15 19:24:37');
insert into comments (description, user_id, community_id, created_date) values ('Unspecified abnormalities of gait and mobility', 1, 16, '2023-05-22 02:34:05');
insert into comments (description, user_id, community_id, created_date) values ('Open bite of front wall of thorax with penetration into thoracic cavity', 1, 67, '2022-06-27 01:42:03');
insert into comments (description, user_id, community_id, created_date) values ('Nondisplaced trimalleolar fracture of right lower leg, subsequent encounter for open fracture type I or II with nonunion', 1, 56, '2024-03-01 22:15:18');
insert into comments (description, user_id, community_id, created_date) values ('Toxic effect of other specified noxious substances eaten as food, undetermined, initial encounter', 1, 61, '2023-07-16 05:08:34');
insert into comments (description, user_id, community_id, created_date) values ('Poisoning by, adverse effect of and underdosing of otorhinolaryngological drugs and preparations', 1, 10, '2022-12-14 06:19:17');
insert into comments (description, user_id, community_id, created_date) values ('Penicillosis', 1, 11, '2024-04-10 03:08:19');
insert into comments (description, user_id, community_id, created_date) values ('Mild persistent asthma', 1, 19, '2020-08-08 18:47:29');
insert into comments (description, user_id, community_id, created_date) values ('Other displaced fracture of seventh cervical vertebra', 1, 77, '2021-11-15 02:35:14');
insert into comments (description, user_id, community_id, created_date) values ('Poisoning by analeptics and opioid receptor antagonists, assault, sequela', 1, 72, '2023-08-20 02:48:32');
insert into comments (description, user_id, community_id, created_date) values ('Unspecified superficial injury of foot', 1, 81, '2021-09-18 21:35:48');
insert into comments (description, user_id, community_id, created_date) values ('Other specified injury of left carotid artery', 1, 29, '2022-04-24 20:16:12');
insert into comments (description, user_id, community_id, created_date) values ('Laceration with foreign body of left thumb without damage to nail, initial encounter', 1, 41, '2020-11-03 10:37:15');
insert into comments (description, user_id, community_id, created_date) values ('Papyraceous fetus, third trimester, fetus 4', 1, 28, '2021-11-02 14:40:55');
insert into comments (description, user_id, community_id, created_date) values ('Obstructed labor due to malposition and malpresentation, unspecified, not applicable or unspecified', 1, 44, '2022-11-09 16:58:47');
insert into comments (description, user_id, community_id, created_date) values ('Other complications of spinal and epidural anesthesia during pregnancy, second trimester', 1, 18, '2023-03-19 22:51:06');
insert into comments (description, user_id, community_id, created_date) values ('Unspecified physeal fracture of upper end of right fibula, initial encounter for closed fracture', 1, 73, '2021-01-30 16:59:08');
insert into comments (description, user_id, community_id, created_date) values ('Laceration with foreign body of unspecified eyelid and periocular area, initial encounter', 1, 24, '2021-12-12 14:05:13');
insert into comments (description, user_id, community_id, created_date) values ('Pressure ulcer of contiguous site of back, buttock and hip', 1, 37, '2024-06-11 15:22:04');

insert into challenge_confirm (user_id, challenge_id, count) values (1, 1, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 2, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 3, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 4, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 5, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 6, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 7, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 8, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 9, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 10, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 11, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 12, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 13, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 14, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 15, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 16, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 17, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 18, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 19, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 20, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 21, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 22, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 23, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 24, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 25, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 26, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 27, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 28, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 29, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 30, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 31, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 32, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 33, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 34, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 35, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 36, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 37, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 38, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 39, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 40, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 41, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 42, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 43, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 44, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 45, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 46, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 47, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 48, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 49, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 50, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 51, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 52, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 53, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 54, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 55, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 56, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 57, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 58, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 59, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 60, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 61, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 62, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 63, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 64, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 65, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 66, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 67, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 68, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 69, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 70, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 71, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 72, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 73, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 74, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 75, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 76, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 77, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 78, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 79, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 80, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 81, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 82, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 83, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 84, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 85, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 86, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 87, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 88, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 89, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 90, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 91, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 92, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 93, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 94, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 95, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 96, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 97, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 98, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 99, 0);
insert into challenge_confirm (user_id, challenge_id, count) values (1, 100, 0);

insert into characters (name, description, type) values ('Cuppie', 'Transfer Trochlear Nerve to Hypoglossal Nerve, Percutaneous Endoscopic Approach
Introduction of Other Antineoplastic into Cranial Cavity and Brain, Percutaneous Approach
Destruction of Right Inner Ear, Open Approach
Drainage of Right Ankle Region, Open ApproachBypass Left Femoral Artery to Bilateral Femoral Arteries with Autologous Arterial Tissue, Percutaneous Endoscopic Approach
Ultrasonography of Stomach
Fusion of Occipital-cervical Joint with Synthetic Substitute, Posterior Approach, Anterior Column, Open Approach
Control Bleeding in Left Lower Extremity, Percutaneous Endoscopic Approach
Removal of Extraluminal Device from Urethra, Percutaneous Endoscopic ApproachDivision of Left Tarsal, Percutaneous Approach
Extirpation of Matter from Middle Esophagus, Percutaneous Endoscopic Approach
Drainage of Thyroid Gland, Percutaneous Approach
Introduction of Other Diagnostic Substance into Female Reproductive, Via Natural or Artificial Opening
Supplement Lingula Bronchus with Autologous Tissue Substitute, Open Approach
Removal of Nonautologous Tissue Substitute from Left Knee Joint, Percutaneous Endoscopic Approach', 'Single-use product');
insert into characters (name, description, type) values ('Tyar', 'Supplement Right Middle Finger with Synthetic Substitute, Open Approach
Dilation of Left Subclavian Artery, Bifurcation, with Three Intraluminal Devices, Percutaneous Approach
Dilation of Face Artery, Bifurcation, with Three Drug-eluting Intraluminal Devices, Percutaneous Approach
Occlusion of Upper Esophagus with Intraluminal Device, Percutaneous Approach
Computerized Tomography (CT Scan) of Right Lower Extremity Arteries using Other Contrast
Fluoroscopy of Right Fallopian Tube
Introduction of Anti-inflammatory into Pleural Cavity, Percutaneous Approach
Revision of Monitoring Device in Pancreatic Duct, Percutaneous Approach
Destruction of Hymen, Via Natural or Artificial Opening
Excision of Left Choroid, Open Approach
Transfer Left Hand Muscle, Percutaneous Endoscopic Approach
Dilation of Abdominal Aorta, Bifurcation, with Three Intraluminal Devices, Percutaneous Approach
Supplement Sacrococcygeal Joint with Nonautologous Tissue Substitute, Percutaneous Approach
Repair Left Sternoclavicular Joint, Percutaneous Endoscopic Approach
Removal of Autologous Tissue Substitute from Hepatobiliary Duct, Percutaneous Approach
Insertion of Intraluminal Device into Right Popliteal Artery, Percutaneous Approach
Drainage of Lesser Omentum, Open Approach
Insertion of Monitoring Device into Pancreatic Duct, Percutaneous Endoscopic Approach
Computerized Tomography (CT Scan) of Bilateral Submandibular Glands using High Osmolar Contrast
Supplement Superior Mesenteric Vein with Synthetic Substitute, Open Approach
Removal of Internal Fixation Device from Left Metacarpal, Percutaneous Endoscopic Approach', 'Air pollution');
insert into characters (name, description, type) values ('Bottly', 'Chiropractic Manipulation of Abdomen, Other Method
Drainage of Right Thyroid Artery, Percutaneous Approach
Removal of Monitoring Device from Cerebral Ventricle, External Approach
Restriction of Left External Carotid Artery, Percutaneous Endoscopic Approach
Alteration of Lower Back, Open Approach
Repair Left Elbow Bursa and Ligament, Percutaneous Approach
Destruction of Left Fibula, Open Approach
Removal of Synthetic Substitute from Right Knee Joint, Tibial Surface, Percutaneous Endoscopic Approach
Revision of Synthetic Substitute in Spinal Canal, Percutaneous Endoscopic Approach
Excision of Bilateral Lungs, Via Natural or Artificial Opening, Diagnostic
Insertion of Spacer into Cervical Vertebral Joint, Percutaneous Approach
Drainage of Left Mandible, Percutaneous Endoscopic Approach, Diagnostic
Excision of Right Rib, Open Approach, Diagnostic
Replacement of Chordae Tendineae with Nonautologous Tissue Substitute, Percutaneous Endoscopic Approach
Introduction of Liquid Brachytherapy Radioisotope into Upper GI, Via Natural or Artificial Opening
Restriction of Portal Vein, Percutaneous Endoscopic Approach
Fluoroscopy of Mouth/Oropharynx using Other Contrast
Repair Left Foot Skin, External Approach
Destruction of Prepuce, Percutaneous Endoscopic Approach', 'Recycle');
insert into characters (name, description, type) values ('Proneer', 'Fusion of Lumbar Vertebral Joint, Posterior Approach, Anterior Column, Percutaneous Endoscopic Approach
Insertion of Intraluminal Device into Hemiazygos Vein, Percutaneous Endoscopic Approach
Supplement Right Wrist Joint with Synthetic Substitute, Percutaneous Approach
Replacement of Nasal Bone with Synthetic Substitute, Open Approach
Excision of Cervical Vertebral Joint, Open Approach, Diagnostic
Measurement of Peripheral Nervous Electrical Activity, External Approach
Drainage of Right Radial Artery with Drainage Device, Percutaneous Endoscopic Approach
Bypass Stomach to Cutaneous with Nonautologous Tissue Substitute, Via Natural or Artificial Opening Endoscopic
Removal of Spacer from Right Acromioclavicular Joint, Percutaneous Endoscopic Approach
Reposition Left Femoral Shaft, Percutaneous Approach
Excision of Hemiazygos Vein, Percutaneous Endoscopic Approach
Replacement of Middle Colic Artery with Synthetic Substitute, Percutaneous Endoscopic Approach
Excision of Splenic Vein, Percutaneous Approach
Bypass Left Kidney Pelvis to Colocutaneous, Open Approach
Excision of Left Ovary, Via Natural or Artificial Opening Endoscopic, Diagnostic
Supplement Esophagus with Autologous Tissue Substitute, Via Natural or Artificial Opening
Removal of Autologous Tissue Substitute from Left Fibula, Percutaneous Endoscopic Approach
Reposition Left Ulna with Monoplanar External Fixation Device, Open Approach
Destruction of Pons, Percutaneous Endoscopic Approach
Revision of Autologous Tissue Substitute in Right Finger Phalanx, Percutaneous Approach
Revision of Nonautologous Tissue Substitute in Bladder, Percutaneous Endoscopic Approach
Drainage of Lumbar Sympathetic Nerve, Percutaneous Approach, Diagnostic
Repair Nervous System in Products of Conception, Via Natural or Artificial Opening
Supplement Right Innominate Vein with Nonautologous Tissue Substitute, Percutaneous Endoscopic Approach
Removal of Infusion Device from Left Shoulder Joint, Open Approach
Occlusion of Jejunum with Intraluminal Device, Open Approach
Bypass Right Internal Iliac Artery to Left External Iliac Artery, Open Approach
Reattachment of Duodenum, Percutaneous Endoscopic Approach
Removal of Synthetic Substitute from Left Hip Joint, Acetabular Surface, Open Approach
Inspection of Bilateral Femoral Region, External Approach
Occlusion of Cystic Duct, Via Natural or Artificial Opening', 'Volunteer');