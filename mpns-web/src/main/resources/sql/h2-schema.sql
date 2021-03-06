CREATE TABLE IF NOT EXISTS T_OFFLINE_MSG
(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  GMT_CREATE TIMESTAMP NOT NULL,
  GMT_MODIFIED TIMESTAMP NOT NULL,
  USER_ID VARCHAR(256) NOT NULL,
  CONTENT BLOB,
  MSG_ID BIGINT,
  EXPIRE_TIME TIMESTAMP NOT NULL,
  STATUS INTEGER NOT NULL
);
COMMENT ON COLUMN T_OFFLINE_MSG.GMT_CREATE IS '数据创建时间';
COMMENT ON COLUMN T_OFFLINE_MSG.GMT_MODIFIED IS '数据修改时间';
COMMENT ON COLUMN T_OFFLINE_MSG.USER_ID IS '目标用户';
COMMENT ON COLUMN T_OFFLINE_MSG.CONTENT IS '消息内容';
COMMENT ON COLUMN T_OFFLINE_MSG.MSG_ID IS '消息ID';
COMMENT ON COLUMN T_OFFLINE_MSG.EXPIRE_TIME IS '失效时间';
COMMENT ON COLUMN T_OFFLINE_MSG.STATUS IS '消息状态';