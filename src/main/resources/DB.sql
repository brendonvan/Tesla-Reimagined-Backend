CREATE TABLE design (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    range INTEGER DEFAULT 0,
    top_speed INTEGER DEFAULT 0,
    zero_to_sixty FLOAT DEFAULT 0,
    motor_options VARCHAR(255),
    paint_options VARCHAR(255),
    wheel_options VARCHAR(255),
    interior_options VARCHAR(255),
    enhanced_autopilot boolean DEFAULT false,
    full_autopilot boolean DEFAULT false
);

CREATE TABLE user (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
);