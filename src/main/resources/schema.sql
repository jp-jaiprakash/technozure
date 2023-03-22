CREATE TABLE venues (
                        id INT PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        address VARCHAR(255) NOT NULL,
                        capacity INT NOT NULL
);

CREATE TABLE events (
                        id INT PRIMARY KEY,
                        title VARCHAR(255) NOT NULL,
                        description VARCHAR(1000) NOT NULL,
                        date DATETIME NOT NULL,
                        venue_id INT,
                        FOREIGN KEY (venue_id) REFERENCES venues(id)
);

CREATE TABLE speakers (
                          id INT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          email VARCHAR(255) NOT NULL,
                          bio VARCHAR(255) NOT NULL,
                          employee_Id VARCHAR(255) NOT NULL
);

CREATE TABLE event_speakers (
                                event_id INT,
                                speaker_id INT,
                                PRIMARY KEY (event_id, speaker_id),
                                FOREIGN KEY (event_id) REFERENCES events(id),
                                FOREIGN KEY (speaker_id) REFERENCES speakers(id)
);
