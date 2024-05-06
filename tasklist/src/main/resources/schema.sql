CREATE TABLE IF NOT EXISTS tasklist (
    id VARCHAR(8) PRIMARY kEY,
    task VARCHAR(256),
    deadline VARCHAR(10),
    done BOOLEAN
);