


INSERT INTO venues  VALUES
                        (1,'Conference Hall A', '123 Main St, Anytown, USA', 30),
                        (2,'Conference Hall B', '456 Market St, Anytown, USA', 35),
                        (3,'Conference Hall C', '789 Broadway St, Anytown, USA',40),
                        (4,'Conference Hall D', '321 Elm St, Anytown, USA',45);
INSERT INTO events  VALUES
                        (1,'Quarterly Technical Event Q1 2023', 'Our first quarterly technical event of 2023', '2023-03-15 09:00:00', 1),
                        (2,'Quarterly Technical Event Q2 2023', 'Our second quarterly technical event of 2023', '2023-06-15 09:00:00', 2),
                        (3,'Quarterly Technical Event Q3 2023', 'Our third quarterly technical event of 2023', '2023-09-15 09:00:00', 3),
                        (4,'Quarterly Technical Event Q4 2023', 'Our fourth quarterly technical event of 2023', '2023-12-15 09:00:00', 4);



INSERT INTO speakers  VALUES
                          (1,'John Doe', 'john.doe@company.com', 'John Doe is a senior software engineer with over 10 years of experience', '12345'),
                          (2,'Jane Smith', 'jane.smith@company.com', 'Jane Smith is a DevOps engineer with experience in containerization and automation', '67890'),
                          (3,'Bob Johnson', 'bob.johnson@company.com', 'Bob Johnson is a software architect with experience in designing and implementing scalable systems', '54321'),
                          (4,'Alice Lee', 'alice.lee@company.com', 'Alice Lee is a frontend developer with experience in React and Angular', '09876');

INSERT INTO event_speakers (event_id, speaker_id) VALUES
                                                      (1, 1),
                                                      (1, 2),
                                                      (2, 2),
                                                      (2, 3),
                                                      (3, 3),
                                                      (3, 4),
                                                      (4, 4),
                                                      (4, 1);
