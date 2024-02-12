-- Insert dummy data into the `hotel` table
INSERT INTO hotel (description, location, name, rating)
VALUES
    ('Luxurious hotel with stunning views', 'New York', 'Grand Hotel', 4.5),
    ('Cozy boutique hotel in the heart of the city', 'Paris', 'Chic Boutique', 4.0),
    ('Family-friendly resort with entertainment options', 'Orlando', 'Sunshine Resort', 4.2);

-- Insert dummy data into the `user` table
INSERT INTO user (email, password, username)
VALUES
    ('user1@example.com', 'password1', 'user1'),
    ('user2@example.com', 'password2', 'user2'),
    ('user3@example.com', 'password3', 'user3');
  

-- Insert dummy data into the `ratings` table
INSERT INTO ratings (rating, review, hotel_id, user_id)
VALUES
    (5, 'Excellent service and amenities', 1, 1),
    (4, 'Beautiful location but room cleanliness could be improved', 2, 2),
    (4, 'Great for families, kids loved the pool', 3, 3);
  
