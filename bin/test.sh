curl -i -v -X GET -H "Content-type: application/json" -H "Accept: application/json" http://$(oc get route --selector="component=${1},application=${2}" --output jsonpath="{.items[0].spec.host}")${3}
