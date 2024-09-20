#!/bin/sh
set -e
shift
until mariadb -h "${db_host}" -u "${db_user}" -p"${db_password}" "${db_name}" -e 'select 1'; do
  sleep 3
done
exec "$@"
